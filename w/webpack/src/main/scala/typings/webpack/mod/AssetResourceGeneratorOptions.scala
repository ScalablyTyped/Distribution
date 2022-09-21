package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generator options for asset/resource modules.
  */
trait AssetResourceGeneratorOptions extends StObject {
  
  /**
  	 * Emit an output asset from this asset module. This can be set to 'false' to omit emitting e. g. for SSR.
  	 */
  var emit: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Specifies the filename template of output files on disk. You must **not** specify an absolute path here, but the path may contain folders separated by '/'! The specified path is joined with the value of the 'output.path' option to determine the location on disk.
  	 */
  var filename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * Emit the asset in the specified folder relative to 'output.path'. This should only be needed when custom 'publicPath' is specified to match the folder structure there.
  	 */
  var outputPath: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * The 'publicPath' specifies the public URL address of the output files when referenced in a browser.
  	 */
  var publicPath: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
}
object AssetResourceGeneratorOptions {
  
  inline def apply(): AssetResourceGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetResourceGeneratorOptions]
  }
  
  extension [Self <: AssetResourceGeneratorOptions](x: Self) {
    
    inline def setEmit(value: Boolean): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
    
    inline def setFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "filename", js.Any.fromFunction2(value))
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setOutputPath(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "outputPath", js.Any.fromFunction2(value))
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPublicPath(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction2(value))
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
  }
}
