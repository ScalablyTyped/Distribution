package typings.vegaLite

import typings.vegaLite.vegaLiteStrings.`type`
import typings.vegaLite.vegaLiteStrings.scale
import typings.vegaLite.vegaLiteStrings.translate
import typings.vegaTypings.projectionMod.BaseProjection
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionMod {
  
  @JSImport("vega-lite/build/src/projection", "PROJECTION_PROPERTIES")
  @js.native
  val PROJECTION_PROPERTIES: js.Array[`type` | scale | translate] = js.native
  
  trait Projection
    extends StObject
       with BaseProjection {
    
    /**
      * The projection’s translation offset as a two-element array `[tx, ty]`.
      */
    @JSName("translate")
    var translate_Projection: js.UndefOr[Vector2[Double] | SignalRef] = js.undefined
  }
  object Projection {
    
    @scala.inline
    def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslate(value: Vector2[Double] | SignalRef): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    }
  }
  
  type ProjectionConfig = Projection
}
