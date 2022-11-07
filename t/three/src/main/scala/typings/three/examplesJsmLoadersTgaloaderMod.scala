package typings.three

import typings.three.srcThreeMod.DataTexture
import typings.three.srcThreeMod.DataTextureLoader
import typings.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersTgaloaderMod {
  
  @JSImport("three/examples/jsm/loaders/TGALoader", "TGALoader")
  @js.native
  open class TGALoader () extends DataTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def parse(data: js.typedarray.ArrayBuffer): DataTexture = js.native
  }
}
