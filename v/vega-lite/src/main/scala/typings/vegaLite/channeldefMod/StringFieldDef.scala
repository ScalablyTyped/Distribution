package typings.vegaLite.channeldefMod

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.srcGuideMod.FormatMixins
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringFieldDef[F /* <: Field */]
  extends StObject
     with TypedFieldDef[F, StandardType, Boolean | BinParams | binned | Null]
     with FormatMixins
object StringFieldDef {
  
  @scala.inline
  def apply[F /* <: Field */](): StringFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringFieldDef[F]]
  }
}
