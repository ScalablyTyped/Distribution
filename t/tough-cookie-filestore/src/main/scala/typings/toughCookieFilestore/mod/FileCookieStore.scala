package typings.toughCookieFilestore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCookieStore extends js.Object {
  
  var filePath: String = js.native
  
  def findCookie(
    domain: String,
    path: String,
    key: String,
    cb: js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]
  ): Unit = js.native
  
  def findCookies(
    domain: String,
    path: String,
    cb: js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]
  ): Unit = js.native
  
  var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]] = js.native
  
  def inspect(): String = js.native
  
  def loadFromFile(filePath: String, cb: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  
  def putCookie(cookie: Cookie, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
  
  def removeCookie(domain: String, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
  
  def removeCookies(domain: String, path: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
  
  def saveToFile(filePath: String, data: js.Any, cb: js.Function0[Unit]): Unit = js.native
  
  var synchronous: Boolean = js.native
  
  def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
}
object FileCookieStore {
  
  @scala.inline
  def apply(
    filePath: String,
    findCookie: (String, String, String, js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]) => Unit,
    findCookies: (String, String, js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]) => Unit,
    idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]],
    inspect: () => String,
    loadFromFile: (String, js.Function1[/* data */ js.Any, Unit]) => Unit,
    putCookie: (Cookie, String, String, js.Function1[/* whatever */ Null, Unit]) => Unit,
    removeCookie: (String, String, String, js.Function1[/* whatever */ Null, Unit]) => Unit,
    removeCookies: (String, String, js.Function1[/* whatever */ Null, Unit]) => Unit,
    saveToFile: (String, js.Any, js.Function0[Unit]) => Unit,
    synchronous: Boolean,
    updateCookie: (Cookie, Cookie, js.Function1[/* whatever */ Null, Unit]) => Unit
  ): FileCookieStore = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], findCookie = js.Any.fromFunction4(findCookie), findCookies = js.Any.fromFunction3(findCookies), idx = idx.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), loadFromFile = js.Any.fromFunction2(loadFromFile), putCookie = js.Any.fromFunction4(putCookie), removeCookie = js.Any.fromFunction4(removeCookie), removeCookies = js.Any.fromFunction3(removeCookies), saveToFile = js.Any.fromFunction3(saveToFile), synchronous = synchronous.asInstanceOf[js.Any], updateCookie = js.Any.fromFunction3(updateCookie))
    __obj.asInstanceOf[FileCookieStore]
  }
  
  @scala.inline
  implicit class FileCookieStoreOps[Self <: FileCookieStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindCookie(
      value: (String, String, String, js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]) => Unit
    ): Self = this.set("findCookie", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFindCookies(
      value: (String, String, js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]) => Unit
    ): Self = this.set("findCookies", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIdx(value: StringDictionary[StringDictionary[StringDictionary[Cookie]]]): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadFromFile(value: (String, js.Function1[/* data */ js.Any, Unit]) => Unit): Self = this.set("loadFromFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPutCookie(value: (Cookie, String, String, js.Function1[/* whatever */ Null, Unit]) => Unit): Self = this.set("putCookie", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveCookie(value: (String, String, String, js.Function1[/* whatever */ Null, Unit]) => Unit): Self = this.set("removeCookie", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveCookies(value: (String, String, js.Function1[/* whatever */ Null, Unit]) => Unit): Self = this.set("removeCookies", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSaveToFile(value: (String, js.Any, js.Function0[Unit]) => Unit): Self = this.set("saveToFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSynchronous(value: Boolean): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCookie(value: (Cookie, Cookie, js.Function1[/* whatever */ Null, Unit]) => Unit): Self = this.set("updateCookie", js.Any.fromFunction3(value))
  }
}
