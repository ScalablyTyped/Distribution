package typings.webgme.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeUtil {
  
  @JSGlobal("GmeUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ASSERT(condition: Boolean): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("ASSERT")(condition.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @JSGlobal("GmeUtil.CANON")
  @js.native
  def CANON_ : typings.webgme.GmeUtil.Canon = js.native
  
  inline def CANON__=(x: typings.webgme.GmeUtil.Canon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANON")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GmeUtil.Canon")
  @js.native
  class Canon ()
    extends StObject
       with typings.webgme.GmeUtil.Canon {
    
    /* CompleteClass */
    override def parse(thing: js.Any): String = js.native
    
    /* CompleteClass */
    override def stringify(thing: js.Any): String = js.native
  }
}
