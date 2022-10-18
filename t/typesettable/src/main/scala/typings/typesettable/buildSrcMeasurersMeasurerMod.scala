package typings.typesettable

import typings.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.AbstractMeasurer
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMeasurersMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/measurer", "Measurer")
  @js.native
  open class Measurer protected () extends AbstractMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    
    def _addGuards(text: String): String = js.native
    
    def _measureLine(line: String): IDimensions = js.native
    def _measureLine(line: String, forceGuards: Boolean): IDimensions = js.native
    
    /* private */ def getGuardWidth(): Any = js.native
    
    /* private */ var guardWidth: Any = js.native
    
    /* private */ var useGuards: Any = js.native
  }
}
