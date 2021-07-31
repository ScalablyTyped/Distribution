package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cldbid extends StObject {
  
  var cldbid: String
}
object Cldbid {
  
  @scala.inline
  def apply(cldbid: String): Cldbid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cldbid]
  }
  
  @scala.inline
  implicit class CldbidMutableBuilder[Self <: Cldbid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
  }
}
