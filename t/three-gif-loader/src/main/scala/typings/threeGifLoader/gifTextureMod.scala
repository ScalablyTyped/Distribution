package typings.threeGifLoader

import typings.omggif.mod.GifReader
import typings.three.mod.CanvasTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gifTextureMod {
  
  @JSImport("three-gif-loader/lib/gif-texture", JSImport.Default)
  @js.native
  open class default () extends GifTexture
  
  @js.native
  trait GifTexture extends CanvasTexture {
    
    def draw(): Unit = js.native
    
    def setReader(reader: GifReader): Unit = js.native
  }
}
