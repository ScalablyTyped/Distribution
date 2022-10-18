package typings.winrtUwp.global.Windows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Perception {
  
  object People {
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.People.HeadPose")
    @js.native
    open class HeadPose ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.People.HeadPose {
      
      /* CompleteClass */
      var forwardDirection: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var position: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var upDirection: Any = js.native
    }
  }
  
  /* note: abstract class */ @JSGlobal("Windows.Perception.PerceptionTimestamp")
  @js.native
  open class PerceptionTimestamp ()
    extends StObject
       with typings.winrtUwp.Windows.Perception.PerceptionTimestamp {
    
    /* CompleteClass */
    var predictionAmount: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var targetTime: Any = js.native
  }
  
  /* note: abstract class */ @JSGlobal("Windows.Perception.PerceptionTimestampHelper")
  @js.native
  open class PerceptionTimestampHelper ()
    extends StObject
       with typings.winrtUwp.Windows.Perception.PerceptionTimestampHelper
  object PerceptionTimestampHelper {
    
    @JSGlobal("Windows.Perception.PerceptionTimestampHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Perception.PerceptionTimestampHelper.fromHistoricalTargetTime")
    @js.native
    def fromHistoricalTargetTime: Any = js.native
    inline def fromHistoricalTargetTime_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromHistoricalTargetTime")(x.asInstanceOf[js.Any])
  }
  
  object Spatial {
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialAnchor")
    @js.native
    open class SpatialAnchor ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchor {
      
      /* unmapped type */
      /* CompleteClass */
      var addEventListener: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var coordinateSystem: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var onrawcoordinatesystemadjusted: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var rawCoordinateSystem: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var removeEventListener: Any = js.native
    }
    object SpatialAnchor {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchor")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchor.tryCreateRelativeTo")
      @js.native
      def tryCreateRelativeTo: Any = js.native
      inline def tryCreateRelativeTo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tryCreateRelativeTo")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialAnchorManager")
    @js.native
    open class SpatialAnchorManager ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchorManager
    object SpatialAnchorManager {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorManager")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorManager.requestStoreAsync")
      @js.native
      def requestStoreAsync: Any = js.native
      inline def requestStoreAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestStoreAsync")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialAnchorRawCoordinateSystemAdjustedEventArgs")
    @js.native
    open class SpatialAnchorRawCoordinateSystemAdjustedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchorRawCoordinateSystemAdjustedEventArgs {
      
      /* CompleteClass */
      var oldRawCoordinateSystemToNewRawCoordinateSystemTransform: Any = js.native
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialAnchorStore")
    @js.native
    open class SpatialAnchorStore ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchorStore {
      
      /* CompleteClass */
      var clear: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var getAllSavedAnchors: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var remove: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var trySave: Any = js.native
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager")
    @js.native
    open class SpatialAnchorTransferManager ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialAnchorTransferManager
    object SpatialAnchorTransferManager {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager.requestAccessAsync")
      @js.native
      def requestAccessAsync: Any = js.native
      inline def requestAccessAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAccessAsync")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager.tryExportAnchorsAsync")
      @js.native
      def tryExportAnchorsAsync: Any = js.native
      inline def tryExportAnchorsAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tryExportAnchorsAsync")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialAnchorTransferManager.tryImportAnchorsAsync")
      @js.native
      def tryImportAnchorsAsync: Any = js.native
      inline def tryImportAnchorsAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tryImportAnchorsAsync")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume")
    @js.native
    open class SpatialBoundingVolume ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialBoundingVolume
    object SpatialBoundingVolume {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume.fromBox")
      @js.native
      def fromBox: Any = js.native
      inline def fromBox_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromBox")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume.fromFrustum")
      @js.native
      def fromFrustum: Any = js.native
      inline def fromFrustum_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromFrustum")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume.fromOrientedBox")
      @js.native
      def fromOrientedBox: Any = js.native
      inline def fromOrientedBox_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromOrientedBox")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialBoundingVolume.fromSphere")
      @js.native
      def fromSphere: Any = js.native
      inline def fromSphere_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromSphere")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialCoordinateSystem")
    @js.native
    open class SpatialCoordinateSystem ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialCoordinateSystem {
      
      /* CompleteClass */
      var tryGetTransformTo: Any = js.native
    }
    
    object SpatialLocatability {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability")
      @js.native
      val ^ : js.Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.orientationOnly")
      @js.native
      def orientationOnly: Any = js.native
      inline def orientationOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orientationOnly")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.positionalTrackingActivating")
      @js.native
      def positionalTrackingActivating: Any = js.native
      inline def positionalTrackingActivating_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionalTrackingActivating")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.positionalTrackingActive")
      @js.native
      def positionalTrackingActive: Any = js.native
      inline def positionalTrackingActive_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionalTrackingActive")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.positionalTrackingInhibited")
      @js.native
      def positionalTrackingInhibited: Any = js.native
      inline def positionalTrackingInhibited_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionalTrackingInhibited")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Perception.Spatial.SpatialLocatability.unavailable")
      @js.native
      def unavailable: Any = js.native
      inline def unavailable_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unavailable")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialLocation")
    @js.native
    open class SpatialLocation ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialLocation {
      
      /* CompleteClass */
      var absoluteAngularAcceleration: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var absoluteAngularVelocity: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var absoluteLinearAcceleration: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var absoluteLinearVelocity: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var orientation: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var position: Any = js.native
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialLocator")
    @js.native
    open class SpatialLocator ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialLocator {
      
      /* unmapped type */
      /* CompleteClass */
      var addEventListener: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var createAttachedFrameOfReferenceAtCurrentHeading: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var createStationaryFrameOfReferenceAtCurrentLocation: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var locatability: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var onlocatabilitychanged: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var onpositionaltrackingdeactivating: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var removeEventListener: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var tryLocateAtTimestamp: Any = js.native
    }
    object SpatialLocator {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialLocator")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Perception.Spatial.SpatialLocator.getDefault")
      @js.native
      def getDefault: Any = js.native
      inline def getDefault_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialLocatorAttachedFrameOfReference")
    @js.native
    open class SpatialLocatorAttachedFrameOfReference ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialLocatorAttachedFrameOfReference {
      
      /* CompleteClass */
      var adjustHeading: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var getStationaryCoordinateSystemAtTimestamp: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var relativeOrientation: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var relativePosition: Any = js.native
      
      /* unmapped type */
      /* CompleteClass */
      var tryGetRelativeHeadingAtTimestamp: Any = js.native
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialLocatorPositionalTrackingDeactivatingEventArgs")
    @js.native
    open class SpatialLocatorPositionalTrackingDeactivatingEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialLocatorPositionalTrackingDeactivatingEventArgs {
      
      /* CompleteClass */
      var canceled: Any = js.native
    }
    
    object SpatialPerceptionAccessStatus {
      
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus")
      @js.native
      val ^ : js.Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus.allowed")
      @js.native
      def allowed: Any = js.native
      inline def allowed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowed")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus.deniedBySystem")
      @js.native
      def deniedBySystem: Any = js.native
      inline def deniedBySystem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deniedBySystem")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus.deniedByUser")
      @js.native
      def deniedByUser: Any = js.native
      inline def deniedByUser_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deniedByUser")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Perception.Spatial.SpatialPerceptionAccessStatus.unspecified")
      @js.native
      def unspecified: Any = js.native
      inline def unspecified_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unspecified")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.SpatialStationaryFrameOfReference")
    @js.native
    open class SpatialStationaryFrameOfReference ()
      extends StObject
         with typings.winrtUwp.Windows.Perception.Spatial.SpatialStationaryFrameOfReference {
      
      /* CompleteClass */
      var coordinateSystem: Any = js.native
    }
    
    object Surfaces {
      
      /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceInfo")
      @js.native
      open class SpatialSurfaceInfo ()
        extends StObject
           with typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceInfo {
        
        /* CompleteClass */
        var id: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var tryComputeLatestMeshAsync: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var tryGetBounds: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var updateTime: Any = js.native
      }
      
      /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMesh")
      @js.native
      open class SpatialSurfaceMesh ()
        extends StObject
           with typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMesh {
        
        /* CompleteClass */
        var coordinateSystem: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var surfaceInfo: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var triangleIndices: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var vertexNormals: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var vertexPositionScale: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var vertexPositions: Any = js.native
      }
      
      /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshBuffer")
      @js.native
      open class SpatialSurfaceMeshBuffer ()
        extends StObject
           with typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshBuffer {
        
        /* CompleteClass */
        var data: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var elementCount: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var format: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var stride: Any = js.native
      }
      
      /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions")
      @js.native
      open class SpatialSurfaceMeshOptions ()
        extends StObject
           with typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions {
        
        /* unmapped type */
        /* CompleteClass */
        var includeVertexNormals: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var triangleIndexFormat: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var vertexNormalFormat: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var vertexPositionFormat: Any = js.native
      }
      object SpatialSurfaceMeshOptions {
        
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions.supportedTriangleIndexFormats")
        @js.native
        def supportedTriangleIndexFormats: Any = js.native
        inline def supportedTriangleIndexFormats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedTriangleIndexFormats")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions.supportedVertexNormalFormats")
        @js.native
        def supportedVertexNormalFormats: Any = js.native
        inline def supportedVertexNormalFormats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedVertexNormalFormats")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions.supportedVertexPositionFormats")
        @js.native
        def supportedVertexPositionFormats: Any = js.native
        inline def supportedVertexPositionFormats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedVertexPositionFormats")(x.asInstanceOf[js.Any])
      }
      
      /* note: abstract class */ @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver")
      @js.native
      open class SpatialSurfaceObserver ()
        extends StObject
           with typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver {
        
        /* unmapped type */
        /* CompleteClass */
        var addEventListener: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var getObservedSurfaces: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var onobservedsurfaceschanged: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var removeEventListener: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var setBoundingVolume: Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var setBoundingVolumes: Any = js.native
      }
      object SpatialSurfaceObserver {
        
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver.requestAccessAsync")
        @js.native
        def requestAccessAsync: Any = js.native
        inline def requestAccessAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAccessAsync")(x.asInstanceOf[js.Any])
      }
    }
  }
}
