package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreInstancedBufferGeometryMod.InstancedBufferGeometry
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcTexturesSourceMod.Source
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersObjectLoaderMod {
  
  @JSImport("three/src/loaders/ObjectLoader", "ObjectLoader")
  @js.native
  open class ObjectLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String): Unit = js.native
    def load(url: String, onLoad: js.Function1[/* object */ Object3D[Event], Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* object */ Object3D[Event], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(url: String, onLoad: Unit, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: Unit,
      onError: js.Function1[/* event */ js.Error | ErrorEvent, Unit]
    ): Unit = js.native
    
    def loadAsync[ObjectType /* <: Object3D[Event] */](url: String): // tslint:disable-next-line:no-unnecessary-generics
    js.Promise[ObjectType] = js.native
    def loadAsync[ObjectType /* <: Object3D[Event] */](url: String, onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]): // tslint:disable-next-line:no-unnecessary-generics
    js.Promise[ObjectType] = js.native
    
    // tslint:disable-next-line:no-unnecessary-generics
    def parse[T /* <: Object3D[Event] */](json: Any): T = js.native
    def parse[T /* <: Object3D[Event] */](json: Any, onLoad: js.Function1[/* object */ Object3D[Event], Unit]): T = js.native
    
    // Array of Classes that inherits from Matrial.
    def parseAnimations(json: Any): js.Array[AnimationClip] = js.native
    
    // tslint:disable-next-line:no-unnecessary-generics
    def parseAsync[T /* <: Object3D[Event] */](json: Any): js.Promise[T] = js.native
    
    def parseGeometries(json: Any): StringDictionary[InstancedBufferGeometry | BufferGeometry[NormalBufferAttributes]] = js.native
    
    def parseImages(json: Any): StringDictionary[Source] = js.native
    def parseImages(json: Any, onLoad: js.Function0[Unit]): StringDictionary[Source] = js.native
    
    def parseImagesAsync(json: Any): js.Promise[StringDictionary[Source]] = js.native
    
    // Array of BufferGeometry or Geometry or Geometry2.
    def parseMaterials(json: Any, textures: StringDictionary[Texture]): js.Array[Material] = js.native
    
    def parseObject[T /* <: Object3D[Event] */](
      data: Any,
      geometries: js.Array[Any],
      materials: js.Array[Material],
      animations: js.Array[AnimationClip]
    ): // tslint:disable-next-line:no-unnecessary-generics
    T = js.native
    
    def parseTextures(json: Any, images: Any): js.Array[Texture] = js.native
  }
}
