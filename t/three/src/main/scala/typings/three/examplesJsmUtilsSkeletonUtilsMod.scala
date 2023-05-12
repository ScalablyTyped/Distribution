package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.AnimationClip
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsSkeletonUtilsMod {
  
  @JSImport("three/examples/jsm/utils/SkeletonUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(source: Object3D[Event]): Object3D[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[Object3D[Event]]
  
  inline def retarget(target: Object3D[Event], source: Object3D[Event], options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retarget")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retarget(target: Object3D[Event], source: Skeleton, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retarget")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retarget(target: Skeleton, source: Object3D[Event], options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retarget")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retarget(target: Skeleton, source: Skeleton, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retarget")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def retargetClip(target: Object3D[Event], source: Object3D[Event], clip: AnimationClip, options: js.Object): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("retargetClip")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
  inline def retargetClip(target: Object3D[Event], source: Skeleton, clip: AnimationClip, options: js.Object): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("retargetClip")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
  inline def retargetClip(target: Skeleton, source: Object3D[Event], clip: AnimationClip, options: js.Object): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("retargetClip")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
  inline def retargetClip(target: Skeleton, source: Skeleton, clip: AnimationClip, options: js.Object): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("retargetClip")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
}
