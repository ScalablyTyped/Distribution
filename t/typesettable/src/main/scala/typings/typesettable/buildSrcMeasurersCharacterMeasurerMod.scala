package typings.typesettable

import typings.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typings.typesettable.buildSrcMeasurersMeasurerMod.Measurer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMeasurersCharacterMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/characterMeasurer", "CharacterMeasurer")
  @js.native
  open class CharacterMeasurer protected () extends Measurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    
    def _measureCharacter(c: String): IDimensions = js.native
  }
}
