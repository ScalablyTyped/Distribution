package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.examplesJsmNodesCoreConstantsMod.AnyJson
import typings.three.examplesJsmNodesLoadersNodeLoaderMod.NodeLoaderResult
import typings.three.srcThreeMod.Material
import typings.three.srcThreeMod.ObjectLoader
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLoadersNodeObjectLoaderMod {
  
  @JSImport("three/examples/jsm/nodes/loaders/NodeObjectLoader", JSImport.Default)
  @js.native
  open class default () extends NodeObjectLoader
  
  @js.native
  trait NodeObjectLoader extends ObjectLoader {
    
    // tslint:disable-next-line:comment-format
    //@ts-expect-error
    def parseMaterials(json: AnyJson, textures: StringDictionary[Texture]): StringDictionary[Material] = js.native
    
    def parseNodes(json: AnyJson, textures: StringDictionary[Texture]): NodeLoaderResult = js.native
  }
}
