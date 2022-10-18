package typings.victoryCore.libMod

import typings.victoryCore.anon.WeakValidationMapVictoryC
import typings.victoryCore.anon.WeakValidationMapVictoryCActive
import typings.victoryCore.anon.WeakValidationMapVictoryD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CommonProps {
  
  @JSImport("victory-core/lib", "CommonProps")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/lib", "CommonProps.baseProps")
  @js.native
  def baseProps: WeakValidationMapVictoryC = js.native
  inline def baseProps_=(x: WeakValidationMapVictoryC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "CommonProps.dataProps")
  @js.native
  def dataProps: WeakValidationMapVictoryD = js.native
  inline def dataProps_=(x: WeakValidationMapVictoryD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/lib", "CommonProps.primitiveProps")
  @js.native
  def primitiveProps: WeakValidationMapVictoryCActive = js.native
  inline def primitiveProps_=(x: WeakValidationMapVictoryCActive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primitiveProps")(x.asInstanceOf[js.Any])
}
