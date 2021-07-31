package typings.stylableCore.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var alias: js.Any
  
  var symlinks: Boolean
}
object Dictkey {
  
  @scala.inline
  def apply(alias: js.Any, symlinks: Boolean): Dictkey = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], symlinks = symlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: js.Any): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymlinks(value: Boolean): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
  }
}
