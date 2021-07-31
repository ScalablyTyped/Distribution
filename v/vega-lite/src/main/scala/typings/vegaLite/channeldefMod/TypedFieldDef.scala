package typings.vegaLite.channeldefMod

import typings.vegaLite.binMod.Bin
import typings.vegaLite.srcGuideMod.TitleMixins
import typings.vegaLite.srcTypeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedFieldDef[F /* <: Field */, T /* <: Type */, B /* <: Bin */]
  extends StObject
     with FieldDefBase[F, B]
     with TitleMixins
     with TypeMixins[T]
object TypedFieldDef {
  
  @scala.inline
  def apply[F /* <: Field */, T /* <: Type */, B /* <: Bin */](): TypedFieldDef[F, T, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedFieldDef[F, T, B]]
  }
}
