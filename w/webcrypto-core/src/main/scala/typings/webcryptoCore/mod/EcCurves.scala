package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "EcCurves")
@js.native
/* private */ open class EcCurves () extends StObject
object EcCurves {
  
  @JSImport("webcrypto-core", "EcCurves")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def find(nameOrId: String): EcCurve | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(nameOrId.asInstanceOf[js.Any]).asInstanceOf[EcCurve | Null]
  
  /* static member */
  inline def get(nameOrId: String): EcCurve = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(nameOrId.asInstanceOf[js.Any]).asInstanceOf[EcCurve]
  
  /* static member */
  @JSImport("webcrypto-core", "EcCurves.items")
  @js.native
  def items: js.Array[EcCurve] = js.native
  inline def items_=(x: js.Array[EcCurve]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("webcrypto-core", "EcCurves.names")
  @js.native
  val names: js.Array[String] = js.native
  
  /* static member */
  inline def register(item: EcCurveParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
