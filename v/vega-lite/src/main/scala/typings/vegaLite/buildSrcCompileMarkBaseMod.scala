package typings.vegaLite

import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcVegaDotschemaMod.VgEncodeEntry
import typings.vegaLite.buildSrcVegaDotschemaMod.VgPostEncodingTransform
import typings.vegaLite.vegaLiteStrings.arc
import typings.vegaLite.vegaLiteStrings.area
import typings.vegaLite.vegaLiteStrings.group
import typings.vegaLite.vegaLiteStrings.image
import typings.vegaLite.vegaLiteStrings.line
import typings.vegaLite.vegaLiteStrings.path
import typings.vegaLite.vegaLiteStrings.rect
import typings.vegaLite.vegaLiteStrings.rule
import typings.vegaLite.vegaLiteStrings.shape
import typings.vegaLite.vegaLiteStrings.symbol
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.trail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkBaseMod {
  
  trait MarkCompiler extends StObject {
    
    def encodeEntry(model: UnitModel): VgEncodeEntry
    
    /**
      * Transform on a mark after render, used for layout and projections
      */
    var postEncodingTransform: js.UndefOr[js.Function1[/* model */ UnitModel, js.Array[VgPostEncodingTransform]]] = js.undefined
    
    /**
      * Underlying Vega Mark type for the Vega-Lite mark.
      */
    var vgMark: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail
  }
  object MarkCompiler {
    
    inline def apply(
      encodeEntry: UnitModel => VgEncodeEntry,
      vgMark: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail
    ): MarkCompiler = {
      val __obj = js.Dynamic.literal(encodeEntry = js.Any.fromFunction1(encodeEntry), vgMark = vgMark.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkCompiler]
    }
    
    extension [Self <: MarkCompiler](x: Self) {
      
      inline def setEncodeEntry(value: UnitModel => VgEncodeEntry): Self = StObject.set(x, "encodeEntry", js.Any.fromFunction1(value))
      
      inline def setPostEncodingTransform(value: /* model */ UnitModel => js.Array[VgPostEncodingTransform]): Self = StObject.set(x, "postEncodingTransform", js.Any.fromFunction1(value))
      
      inline def setPostEncodingTransformUndefined: Self = StObject.set(x, "postEncodingTransform", js.undefined)
      
      inline def setVgMark(value: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail): Self = StObject.set(x, "vgMark", value.asInstanceOf[js.Any])
    }
  }
}
