package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcThreeMod.AnimationClip
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersBvhloaderMod {
  
  @JSImport("three/examples/jsm/loaders/BVHLoader", "BVHLoader")
  @js.native
  open class BVHLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var animateBonePositions: Boolean = js.native
    
    var animateBoneRotations: Boolean = js.native
    
    def load(url: String, onLoad: js.Function1[/* bvh */ BVH, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bvh */ BVH, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bvh */ BVH, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bvh */ BVH, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(text: String): BVH = js.native
  }
  
  trait BVH extends StObject {
    
    var clip: AnimationClip
    
    var skeleton: Skeleton
  }
  object BVH {
    
    inline def apply(clip: AnimationClip, skeleton: Skeleton): BVH = {
      val __obj = js.Dynamic.literal(clip = clip.asInstanceOf[js.Any], skeleton = skeleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[BVH]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BVH] (val x: Self) extends AnyVal {
      
      inline def setClip(value: AnimationClip): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
    }
  }
}
