package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcBinMod.Bin
import typings.vegaLite.buildSrcGuideMod.TitleMixins
import typings.vegaLite.buildSrcTypeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedFieldDef[F /* <: Field */, T /* <: Type */, B /* <: Bin */]
  extends StObject
     with FieldDefBase[F, B]
     with TitleMixins
     with TypeMixins[T]
object TypedFieldDef {
  
  inline def apply[F /* <: Field */, T /* <: Type */, B /* <: Bin */](): TypedFieldDef[F, T, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedFieldDef[F, T, B]]
  }
}
