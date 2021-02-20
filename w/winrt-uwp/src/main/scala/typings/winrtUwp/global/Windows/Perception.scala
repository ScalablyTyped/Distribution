package typings.winrtUwp.global.Windows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Perception {
  
  object People {
    
    @JSGlobal("Windows.Perception.People.HeadPose")
    @js.native
    abstract class HeadPose ()
      extends typings.winrtUwp.Windows.Perception.People.HeadPose
  }
  
  @JSGlobal("Windows.Perception.PerceptionTimestamp")
  @js.native
  abstract class PerceptionTimestamp ()
    extends typings.winrtUwp.Windows.Perception.PerceptionTimestamp
  
  @JSGlobal("Windows.Perception.PerceptionTimestampHelper")
  @js.native
  abstract class PerceptionTimestampHelper ()
    extends typings.winrtUwp.Windows.Perception.PerceptionTimestampHelper
  object PerceptionTimestampHelper {
    
    @JSGlobal("Windows.Perception.PerceptionTimestampHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Perception.PerceptionTimestampHelper.fromHistoricalTargetTime")
    @js.native
    def fromHistoricalTargetTime: js.Any = js.native
    @scala.inline
    def fromHistoricalTargetTime_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromHistoricalTargetTime")(x.asInstanceOf[js.Any])
  }
  
  object Spatial {
    
    @JSGlobal("Windows.Perception.Spatial.SpatialAnchor")
    @js.native
    abstract class SpatialAnchor ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchor
    object SpatialAnchor {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchor")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchor.tryCreateRelativeTo")
      @js.native
      def tryCreateRelativeTo: js.Any = js.native
      @scala.inline
      def tryCreateRelativeTo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tryCreateRelativeTo")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Perception.Spatial.SpatialAnchorManager")
    @js.native
    abstract class SpatialAnchorManager ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchorManager
    object SpatialAnchorManager {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorManager")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorManager.requestStoreAsync")
      @js.native
      def requestStoreAsync: js.Any = js.native
      @scala.inline
      def requestStoreAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestStoreAsync")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Perception.Spatial.SpatialAnchorRawCoordinateSystemAdjustedEventArgs")
    @js.native
    abstract class SpatialAnchorRawCoordinateSystemAdjustedEventArgs ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchorRawCoordinateSystemAdjustedEventArgs
    
    @JSGlobal("Windows.Perception.Spatial.SpatialAnchorStore")
    @js.native
    abstract class SpatialAnchorStore ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchorStore
    
    @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager")
    @js.native
    abstract class SpatialAnchorTransferManager ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchorTransferManager
    object SpatialAnchorTransferManager {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager.requestAccessAsync")
      @js.native
      def requestAccessAsync: js.Any = js.native
      @scala.inline
      def requestAccessAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAccessAsync")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager.tryExportAnchorsAsync")
      @js.native
      def tryExportAnchorsAsync: js.Any = js.native
      @scala.inline
      def tryExportAnchorsAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tryExportAnchorsAsync")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager.tryImportAnchorsAsync")
      @js.native
      def tryImportAnchorsAsync: js.Any = js.native
      @scala.inline
      def tryImportAnchorsAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tryImportAnchorsAsync")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume")
    @js.native
    abstract class SpatialBoundingVolume ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialBoundingVolume
    object SpatialBoundingVolume {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume.fromBox")
      @js.native
      def fromBox: js.Any = js.native
      @scala.inline
      def fromBox_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromBox")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume.fromFrustum")
      @js.native
      def fromFrustum: js.Any = js.native
      @scala.inline
      def fromFrustum_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromFrustum")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume.fromOrientedBox")
      @js.native
      def fromOrientedBox: js.Any = js.native
      @scala.inline
      def fromOrientedBox_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromOrientedBox")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume.fromSphere")
      @js.native
      def fromSphere: js.Any = js.native
      @scala.inline
      def fromSphere_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromSphere")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Perception.Spatial.SpatialCoordinateSystem")
    @js.native
    abstract class SpatialCoordinateSystem ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialCoordinateSystem
    
    object SpatialLocatability {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability")
      @js.native
      val ^ : js.Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.orientationOnly")
      @js.native
      def orientationOnly: js.Any = js.native
      @scala.inline
      def orientationOnly_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientationOnly")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.positionalTrackingActivating")
      @js.native
      def positionalTrackingActivating: js.Any = js.native
      @scala.inline
      def positionalTrackingActivating_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionalTrackingActivating")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.positionalTrackingActive")
      @js.native
      def positionalTrackingActive: js.Any = js.native
      @scala.inline
      def positionalTrackingActive_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionalTrackingActive")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.positionalTrackingInhibited")
      @js.native
      def positionalTrackingInhibited: js.Any = js.native
      @scala.inline
      def positionalTrackingInhibited_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionalTrackingInhibited")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.unavailable")
      @js.native
      def unavailable: js.Any = js.native
      @scala.inline
      def unavailable_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unavailable")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Perception.Spatial.SpatialLocation")
    @js.native
    abstract class SpatialLocation ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialLocation
    
    @JSGlobal("Windows.Perception.Spatial.SpatialLocator")
    @js.native
    abstract class SpatialLocator ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialLocator
    object SpatialLocator {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialLocator")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocator.getDefault")
      @js.native
      def getDefault: js.Any = js.native
      @scala.inline
      def getDefault_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Perception.Spatial.SpatialLocatorAttachedFrameOfReference")
    @js.native
    abstract class SpatialLocatorAttachedFrameOfReference ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialLocatorAttachedFrameOfReference
    
    @JSGlobal("Windows.Perception.Spatial.SpatialLocatorPositionalTrackingDeactivatingEventArgs")
    @js.native
    abstract class SpatialLocatorPositionalTrackingDeactivatingEventArgs ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialLocatorPositionalTrackingDeactivatingEventArgs
    
    object SpatialPerceptionAccessStatus {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus")
      @js.native
      val ^ : js.Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus.allowed")
      @js.native
      def allowed: js.Any = js.native
      @scala.inline
      def allowed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowed")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus.deniedBySystem")
      @js.native
      def deniedBySystem: js.Any = js.native
      @scala.inline
      def deniedBySystem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deniedBySystem")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus.deniedByUser")
      @js.native
      def deniedByUser: js.Any = js.native
      @scala.inline
      def deniedByUser_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deniedByUser")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus.unspecified")
      @js.native
      def unspecified: js.Any = js.native
      @scala.inline
      def unspecified_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unspecified")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Perception.Spatial.SpatialStationaryFrameOfReference")
    @js.native
    abstract class SpatialStationaryFrameOfReference ()
      extends typings.winrtUwp.Windows.Perception.Spatial.SpatialStationaryFrameOfReference
    
    object Surfaces {
      
      @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceInfo")
      @js.native
      abstract class SpatialSurfaceInfo ()
        extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceInfo
      
      @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMesh")
      @js.native
      abstract class SpatialSurfaceMesh ()
        extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMesh
      
      @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshBuffer")
      @js.native
      abstract class SpatialSurfaceMeshBuffer ()
        extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshBuffer
      
      @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions")
      @js.native
      abstract class SpatialSurfaceMeshOptions ()
        extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions
      object SpatialSurfaceMeshOptions {
        
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions.supportedTriangleIndexFormats")
        @js.native
        def supportedTriangleIndexFormats: js.Any = js.native
        @scala.inline
        def supportedTriangleIndexFormats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedTriangleIndexFormats")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions.supportedVertexNormalFormats")
        @js.native
        def supportedVertexNormalFormats: js.Any = js.native
        @scala.inline
        def supportedVertexNormalFormats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedVertexNormalFormats")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions.supportedVertexPositionFormats")
        @js.native
        def supportedVertexPositionFormats: js.Any = js.native
        @scala.inline
        def supportedVertexPositionFormats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedVertexPositionFormats")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver")
      @js.native
      abstract class SpatialSurfaceObserver ()
        extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver
      object SpatialSurfaceObserver {
        
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver.requestAccessAsync")
        @js.native
        def requestAccessAsync: js.Any = js.native
        @scala.inline
        def requestAccessAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAccessAsync")(x.asInstanceOf[js.Any])
      }
    }
  }
}
