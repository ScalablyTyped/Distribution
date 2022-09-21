package typings.stropheJs.mod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementType extends StObject
/** PrivateConstants: DOM Element Type Constants
  *  DOM element types.
  *
  *  ElementType.NORMAL - Normal element.
  *  ElementType.TEXT - Text data element.
  *  ElementType.FRAGMENT - XHTML fragment element.
  */
@JSGlobal("Strophe.ElementType")
@js.native
object ElementType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType & Double] = js.native
  
  @js.native
  sealed trait CDATA
    extends StObject
       with ElementType
  /* 4 */ val CDATA: typings.stropheJs.mod.global.Strophe.ElementType.CDATA & Double = js.native
  
  @js.native
  sealed trait FRAGMENT
    extends StObject
       with ElementType
  /* 11 */ val FRAGMENT: typings.stropheJs.mod.global.Strophe.ElementType.FRAGMENT & Double = js.native
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with ElementType
  /* 1 */ val NORMAL: typings.stropheJs.mod.global.Strophe.ElementType.NORMAL & Double = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with ElementType
  /* 3 */ val TEXT: typings.stropheJs.mod.global.Strophe.ElementType.TEXT & Double = js.native
}
