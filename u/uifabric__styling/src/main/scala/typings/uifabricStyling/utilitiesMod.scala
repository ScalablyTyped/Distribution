package typings.uifabricStyling

import org.scalablytyped.runtime.TopLevel
import typings.uifabricStyling.anon.PartialIIconOptions
import typings.uifabricStyling.iconsMod.IIconRecord
import typings.uifabricStyling.iconsMod.IIconSubset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("@uifabric/styling/lib/utilities", "buildClassMap")
  @js.native
  def buildClassMap[T /* <: js.Object */](styles: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? string}
    */ typings.uifabricStyling.uifabricStylingStrings.buildClassMap with TopLevel[js.Any] = js.native
  
  @JSImport("@uifabric/styling/lib/utilities", "getIcon")
  @js.native
  def getIcon(): js.UndefOr[IIconRecord] = js.native
  @JSImport("@uifabric/styling/lib/utilities", "getIcon")
  @js.native
  def getIcon(name: String): js.UndefOr[IIconRecord] = js.native
  
  @JSImport("@uifabric/styling/lib/utilities", "getIconClassName")
  @js.native
  def getIconClassName(name: String): String = js.native
  
  @JSImport("@uifabric/styling/lib/utilities", "registerIconAlias")
  @js.native
  def registerIconAlias(iconName: String, mappedToName: String): Unit = js.native
  
  @JSImport("@uifabric/styling/lib/utilities", "registerIcons")
  @js.native
  def registerIcons(iconSubset: IIconSubset): Unit = js.native
  @JSImport("@uifabric/styling/lib/utilities", "registerIcons")
  @js.native
  def registerIcons(iconSubset: IIconSubset, options: PartialIIconOptions): Unit = js.native
  
  @JSImport("@uifabric/styling/lib/utilities", "setIconOptions")
  @js.native
  def setIconOptions(options: PartialIIconOptions): Unit = js.native
  
  @JSImport("@uifabric/styling/lib/utilities", "unregisterIcons")
  @js.native
  def unregisterIcons(iconNames: js.Array[String]): Unit = js.native
}
