package typings.typesettable

import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.contextsMod.IRulerFactoryContext
import typings.typesettable.measurerMod.Measurer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object characterMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/characterMeasurer", "CharacterMeasurer")
  @js.native
  class CharacterMeasurer protected () extends Measurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    
    def _measureCharacter(c: String): IDimensions = js.native
  }
}
