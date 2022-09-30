package typings.victoryCore.mod

import typings.victoryCore.victoryThemeTypesMod.VictoryThemeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryTheme {
  
  @JSImport("victory-core/lib", "VictoryTheme")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "VictoryTheme.grayscale")
  @js.native
  def grayscale: VictoryThemeDefinition = js.native
  inline def grayscale_=(x: VictoryThemeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "VictoryTheme.material")
  @js.native
  def material: VictoryThemeDefinition = js.native
  inline def material_=(x: VictoryThemeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("material")(x.asInstanceOf[js.Any])
}
