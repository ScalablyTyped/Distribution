package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FSyncOptions extends StObject {
  
  /**
    * Specify a file sync write concern.
    */
  var fsync: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double | String] = js.undefined
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}
object FSyncOptions {
  
  @scala.inline
  def apply(): FSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSyncOptions]
  }
  
  @scala.inline
  implicit class FSyncOptionsMutableBuilder[Self <: FSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setW(value: scala.Double | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
