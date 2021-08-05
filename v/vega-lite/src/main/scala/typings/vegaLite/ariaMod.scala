package typings.vegaLite

import typings.vegaLite.anon.AriaAriaRoleDescription
import typings.vegaLite.anon.AriaRoleDescription
import typings.vegaLite.anon.Clip
import typings.vegaLite.anon.Description
import typings.vegaLite.anon.PartialRecordVgEncodeChan
import typings.vegaLite.anon.`3`
import typings.vegaLite.unitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ariaMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/aria", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aria(model: UnitModel): AriaRoleDescription | Description | Clip | AriaAriaRoleDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("aria")(model.asInstanceOf[js.Any]).asInstanceOf[AriaRoleDescription | Description | Clip | AriaAriaRoleDescription]
  
  inline def description(model: UnitModel): PartialRecordVgEncodeChan | `3` = ^.asInstanceOf[js.Dynamic].applyDynamic("description")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan | `3`]
}
