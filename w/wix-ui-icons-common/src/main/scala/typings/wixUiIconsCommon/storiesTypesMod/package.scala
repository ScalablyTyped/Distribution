package typings.wixUiIconsCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storiesTypesMod {
  
  type CategoryTableRow = js.Array[typings.react.mod.ReactNode]
  
  type GeneralTableRow = js.Tuple5[
    typings.react.mod.ReactNode, 
    js.UndefOr[java.lang.String], 
    typings.react.mod.ReactNode, 
    js.UndefOr[java.lang.String], 
    js.UndefOr[java.lang.String]
  ]
  
  type IconsMetadataIndex = typings.fuseJs.mod.^[
    typings.wixUiIconsCommon.typesMod.IconMetadata, 
    typings.fuseJs.mod.FuseOptions[typings.wixUiIconsCommon.typesMod.IconMetadata]
  ]
  
  type SystemTableRow = js.Tuple3[java.lang.String, typings.react.mod.ReactNode, js.UndefOr[java.lang.String]]
}
