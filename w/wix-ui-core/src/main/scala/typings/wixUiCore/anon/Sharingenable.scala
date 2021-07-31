package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sharingenable extends StObject {
  
  var `sharing-enable`: Boolean
}
object Sharingenable {
  
  @scala.inline
  def apply(`sharing-enable`: Boolean): Sharingenable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sharing-enable")(`sharing-enable`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sharingenable]
  }
  
  @scala.inline
  implicit class SharingenableMutableBuilder[Self <: Sharingenable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setSharing-enable`(value: Boolean): Self = StObject.set(x, "sharing-enable", value.asInstanceOf[js.Any])
  }
}
