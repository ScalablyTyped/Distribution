package typings.wasmFeatureDetect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wasm-feature-detect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(bulkMemory, exceptions, extendedConst, gc, memory64, multiValue, mutableGlobals, referenceTypes, relaxedSimd, saturatedFloatToInt, signExtensions, simd, streamingCompilation, tailCall, threads) */ inline def bigInt(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bigInt")().asInstanceOf[js.Promise[Boolean]]
}
