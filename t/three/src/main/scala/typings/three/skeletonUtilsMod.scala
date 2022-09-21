package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.AnimationClip
import typings.three.threeMod.Bone
import typings.three.threeMod.Matrix4
import typings.three.threeMod.Object3D
import typings.three.threeMod.Skeleton
import typings.three.threeMod.SkeletonHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonUtilsMod {
  
  @JSImport("three/examples/jsm/utils/SkeletonUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(source: Object3D[Event]): Object3D[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[Object3D[Event]]
  
  inline def findBoneTrackData(name: String, tracks: js.Array[Any]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("findBoneTrackData")(name.asInstanceOf[js.Any], tracks.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getBoneByName(name: String, skeleton: Skeleton): Bone = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoneByName")(name.asInstanceOf[js.Any], skeleton.asInstanceOf[js.Any])).asInstanceOf[Bone]
  
  inline def getBones(skeleton: js.Array[Bone]): js.Array[Bone] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBones")(skeleton.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bone]]
  inline def getBones(skeleton: Skeleton): js.Array[Bone] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBones")(skeleton.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bone]]
  
  inline def getEqualsBonesNames(skeleton: Skeleton, targetSkeleton: Skeleton): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEqualsBonesNames")(skeleton.asInstanceOf[js.Any], targetSkeleton.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getHelperFromSkeleton(skeleton: Skeleton): SkeletonHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("getHelperFromSkeleton")(skeleton.asInstanceOf[js.Any]).asInstanceOf[SkeletonHelper]
  
  inline def getNearestBone(bone: Bone, names: js.Object): Bone = (^.asInstanceOf[js.Dynamic].applyDynamic("getNearestBone")(bone.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Bone]
  
  inline def getSkeletonOffsets(target: Object3D[Event], source: Object3D[Event], options: js.Object): js.Array[Matrix4] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSkeletonOffsets")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Matrix4]]
  inline def getSkeletonOffsets(target: Object3D[Event], source: Skeleton, options: js.Object): js.Array[Matrix4] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSkeletonOffsets")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Matrix4]]
  inline def getSkeletonOffsets(target: Skeleton, source: Object3D[Event], options: js.Object): js.Array[Matrix4] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSkeletonOffsets")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Matrix4]]
  inline def getSkeletonOffsets(target: Skeleton, source: Skeleton, options: js.Object): js.Array[Matrix4] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSkeletonOffsets")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Matrix4]]
  
  inline def renameBones(skeleton: Skeleton, names: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renameBones")(skeleton.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def retarget(target: Object3D[Event], source: Object3D[Event], options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retarget")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retarget(target: Object3D[Event], source: Skeleton, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retarget")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retarget(target: Skeleton, source: Object3D[Event], options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retarget")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retarget(target: Skeleton, source: Skeleton, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retarget")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def retargetClip(target: Object3D[Event], source: Object3D[Event], clip: AnimationClip, options: js.Object): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("retargetClip")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
  inline def retargetClip(target: Object3D[Event], source: Skeleton, clip: AnimationClip, options: js.Object): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("retargetClip")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
  inline def retargetClip(target: Skeleton, source: Object3D[Event], clip: AnimationClip, options: js.Object): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("retargetClip")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
  inline def retargetClip(target: Skeleton, source: Skeleton, clip: AnimationClip, options: js.Object): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("retargetClip")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
}
