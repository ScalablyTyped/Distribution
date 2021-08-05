package typings.typesettable

import typings.typesettable.abstractMeasurerMod.AbstractMeasurer
import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.contextsMod.IRulerFactoryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measurerMod {
  
  @JSImport("typesettable/build/src/measurers/measurer", "Measurer")
  @js.native
  class Measurer protected () extends AbstractMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    
    def _addGuards(text: String): String = js.native
    
    def _measureLine(line: String): IDimensions = js.native
    def _measureLine(line: String, forceGuards: Boolean): IDimensions = js.native
    
    /* private */ def getGuardWidth(): js.Any = js.native
    
    /* private */ var guardWidth: js.Any = js.native
    
    /* private */ var useGuards: js.Any = js.native
  }
}
