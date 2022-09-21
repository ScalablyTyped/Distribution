package typings.tabris.global.tabris

import typings.tabris.Blob
import typings.tabris.anon.ResizeHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.ImageBitmap")
@js.native
/**
  * Represents an in-memory Image. Unlike ImageData it is immutable, but can be created from a number of
  * sources via [createImageBitmap](#createimagebitmapimagesource-options).
  */
/* private */ open class ImageBitmap ()
  extends typings.tabris.mod.ImageBitmap
/* static members */
object ImageBitmap {
  
  @JSGlobal("tabris.ImageBitmap")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a promise that resolves to a new instance of ImageBitmap. Also available in global scope.
    * @param imageSource The data source to create an ImageBitmap instance from.
    * @param options Options for resizing the image.
    */
  inline def createImageBitmap(imageSource: Blob): js.Promise[typings.tabris.mod.ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: Blob, options: ResizeHeight): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  /**
    * Creates a promise that resolves to a new instance of ImageBitmap. Also available in global scope.
    * @param imageSource The data source to create an ImageBitmap instance from.
    * @param sx The x coordinate of the reference point of the rectangle from which the ImageBitmap will be extracted.
    * @param sy The y coordinate of the reference point of the rectangle from which the ImageBitmap will be extracted.
    * @param sw The width of the rectangle from which the ImageBitmap will be extracted.
    * @param sh The height of the rectangle from which the ImageBitmap will be extracted.
    * @param options Options for resizing the image.
    */
  inline def createImageBitmap(imageSource: Blob, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: Blob, sx: Double, sy: Double, sw: Double, sh: Double, options: ResizeHeight): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.ImageData): js.Promise[typings.tabris.mod.ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.ImageData, options: ResizeHeight): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.ImageData, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(
    imageSource: typings.tabris.ImageData,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ResizeHeight
  ): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.mod.Canvas): js.Promise[typings.tabris.mod.ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.mod.Canvas, options: ResizeHeight): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.mod.Canvas, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(
    imageSource: typings.tabris.mod.Canvas,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ResizeHeight
  ): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.mod.ImageBitmap): js.Promise[typings.tabris.mod.ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.mod.ImageBitmap, options: ResizeHeight): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(imageSource: typings.tabris.mod.ImageBitmap, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
  inline def createImageBitmap(
    imageSource: typings.tabris.mod.ImageBitmap,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ResizeHeight
  ): js.Promise[typings.tabris.mod.ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.mod.ImageBitmap]]
}
