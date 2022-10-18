package typings.victoryCore

import typings.victoryCore.libVictoryThemeTypesMod.VictoryThemeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryThemeVictoryThemeMod {
  
  object VictoryTheme {
    
    @JSImport("victory-core/lib/victory-theme/victory-theme", "VictoryTheme")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-theme/victory-theme", "VictoryTheme.grayscale")
    @js.native
    def grayscale: VictoryThemeDefinition = js.native
    inline def grayscale_=(x: VictoryThemeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-theme/victory-theme", "VictoryTheme.material")
    @js.native
    def material: VictoryThemeDefinition = js.native
    inline def material_=(x: VictoryThemeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("material")(x.asInstanceOf[js.Any])
  }
}
