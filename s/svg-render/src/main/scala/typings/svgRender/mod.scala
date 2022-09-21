package typings.svgRender

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Render high-quality PNG images from an SVG.
    *
    * @example
    * import { promises as fs } from 'fs';
    * import render = require('svg-render');
    *
    * (async () => {
    *   const outputBuffer = await render({
    *     buffer: await fs.readFile('/path/to/my/input.svg'),
    *     width: 512
    *   });
    *
    *   await fs.writeFile('./output.png', outputBuffer);
    * })();
    */
  inline def apply(options: Options): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("svg-render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * The SVG being rendered.
      */
    var buffer: Buffer
    
    /**
      * Whether to replace instances of `use` tags in the SVG with the contents that
      * those tags are linking to. This is generally necessary for rendering method
      * being used to work correctly.
      *
      * @default true
      */
    var expandUseTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The desired height of the output PNG. Defaults to the height defined in the SVG
      * (or proportionally scaled based on `width` when defined).
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The desired width of the output PNG. Defaults to the width defined in the SVG
      * (or proportionally scaled based on `height` when defined).
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(buffer: Buffer): Options = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setExpandUseTags(value: Boolean): Self = StObject.set(x, "expandUseTags", value.asInstanceOf[js.Any])
      
      inline def setExpandUseTagsUndefined: Self = StObject.set(x, "expandUseTags", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
