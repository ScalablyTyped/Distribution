package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForcePush extends StObject {
  
  var create: scala.Double
  
  var forcePush: scala.Double
  
  var push: scala.Double
  
  var rebase: scala.Double
  
  var unknown: scala.Double
}
object ForcePush {
  
  @scala.inline
  def apply(
    create: scala.Double,
    forcePush: scala.Double,
    push: scala.Double,
    rebase: scala.Double,
    unknown: scala.Double
  ): ForcePush = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], forcePush = forcePush.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rebase = rebase.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePush]
  }
  
  @scala.inline
  implicit class ForcePushMutableBuilder[Self <: ForcePush] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: scala.Double): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcePush(value: scala.Double): Self = StObject.set(x, "forcePush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: scala.Double): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebase(value: scala.Double): Self = StObject.set(x, "rebase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
