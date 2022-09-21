package typings.winrtUwp.Windows.Graphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Holographic {
  
  trait HolographicCamera extends StObject {
    
    var id: Any
    
    /* unmapped type */
    var isStereo: Any
    
    /* unmapped type */
    var renderTargetSize: Any
    
    /* unmapped type */
    var setFarPlaneDistance: Any
    
    /* unmapped type */
    var setNearPlaneDistance: Any
    
    /* unmapped type */
    var viewportScaleFactor: Any
  }
  object HolographicCamera {
    
    inline def apply(
      id: Any,
      isStereo: Any,
      renderTargetSize: Any,
      setFarPlaneDistance: Any,
      setNearPlaneDistance: Any,
      viewportScaleFactor: Any
    ): HolographicCamera = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isStereo = isStereo.asInstanceOf[js.Any], renderTargetSize = renderTargetSize.asInstanceOf[js.Any], setFarPlaneDistance = setFarPlaneDistance.asInstanceOf[js.Any], setNearPlaneDistance = setNearPlaneDistance.asInstanceOf[js.Any], viewportScaleFactor = viewportScaleFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicCamera]
    }
    
    extension [Self <: HolographicCamera](x: Self) {
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsStereo(value: Any): Self = StObject.set(x, "isStereo", value.asInstanceOf[js.Any])
      
      inline def setRenderTargetSize(value: Any): Self = StObject.set(x, "renderTargetSize", value.asInstanceOf[js.Any])
      
      inline def setSetFarPlaneDistance(value: Any): Self = StObject.set(x, "setFarPlaneDistance", value.asInstanceOf[js.Any])
      
      inline def setSetNearPlaneDistance(value: Any): Self = StObject.set(x, "setNearPlaneDistance", value.asInstanceOf[js.Any])
      
      inline def setViewportScaleFactor(value: Any): Self = StObject.set(x, "viewportScaleFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicCameraPose extends StObject {
    
    var farPlaneDistance: Any
    
    /* unmapped type */
    var holographicCamera: Any
    
    /* unmapped type */
    var nearPlaneDistance: Any
    
    /* unmapped type */
    var projectionTransform: Any
    
    /* unmapped type */
    var tryGetCullingFrustum: Any
    
    /* unmapped type */
    var tryGetViewTransform: Any
    
    /* unmapped type */
    var tryGetVisibleFrustum: Any
    
    /* unmapped type */
    var viewport: Any
  }
  object HolographicCameraPose {
    
    inline def apply(
      farPlaneDistance: Any,
      holographicCamera: Any,
      nearPlaneDistance: Any,
      projectionTransform: Any,
      tryGetCullingFrustum: Any,
      tryGetViewTransform: Any,
      tryGetVisibleFrustum: Any,
      viewport: Any
    ): HolographicCameraPose = {
      val __obj = js.Dynamic.literal(farPlaneDistance = farPlaneDistance.asInstanceOf[js.Any], holographicCamera = holographicCamera.asInstanceOf[js.Any], nearPlaneDistance = nearPlaneDistance.asInstanceOf[js.Any], projectionTransform = projectionTransform.asInstanceOf[js.Any], tryGetCullingFrustum = tryGetCullingFrustum.asInstanceOf[js.Any], tryGetViewTransform = tryGetViewTransform.asInstanceOf[js.Any], tryGetVisibleFrustum = tryGetVisibleFrustum.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicCameraPose]
    }
    
    extension [Self <: HolographicCameraPose](x: Self) {
      
      inline def setFarPlaneDistance(value: Any): Self = StObject.set(x, "farPlaneDistance", value.asInstanceOf[js.Any])
      
      inline def setHolographicCamera(value: Any): Self = StObject.set(x, "holographicCamera", value.asInstanceOf[js.Any])
      
      inline def setNearPlaneDistance(value: Any): Self = StObject.set(x, "nearPlaneDistance", value.asInstanceOf[js.Any])
      
      inline def setProjectionTransform(value: Any): Self = StObject.set(x, "projectionTransform", value.asInstanceOf[js.Any])
      
      inline def setTryGetCullingFrustum(value: Any): Self = StObject.set(x, "tryGetCullingFrustum", value.asInstanceOf[js.Any])
      
      inline def setTryGetViewTransform(value: Any): Self = StObject.set(x, "tryGetViewTransform", value.asInstanceOf[js.Any])
      
      inline def setTryGetVisibleFrustum(value: Any): Self = StObject.set(x, "tryGetVisibleFrustum", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: Any): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicCameraRenderingParameters extends StObject {
    
    var direct3D11BackBuffer: Any
    
    /* unmapped type */
    var direct3D11Device: Any
    
    /* unmapped type */
    var setFocusPoint: Any
  }
  object HolographicCameraRenderingParameters {
    
    inline def apply(direct3D11BackBuffer: Any, direct3D11Device: Any, setFocusPoint: Any): HolographicCameraRenderingParameters = {
      val __obj = js.Dynamic.literal(direct3D11BackBuffer = direct3D11BackBuffer.asInstanceOf[js.Any], direct3D11Device = direct3D11Device.asInstanceOf[js.Any], setFocusPoint = setFocusPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicCameraRenderingParameters]
    }
    
    extension [Self <: HolographicCameraRenderingParameters](x: Self) {
      
      inline def setDirect3D11BackBuffer(value: Any): Self = StObject.set(x, "direct3D11BackBuffer", value.asInstanceOf[js.Any])
      
      inline def setDirect3D11Device(value: Any): Self = StObject.set(x, "direct3D11Device", value.asInstanceOf[js.Any])
      
      inline def setSetFocusPoint(value: Any): Self = StObject.set(x, "setFocusPoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicFrame extends StObject {
    
    var addedCameras: Any
    
    /* unmapped type */
    var currentPrediction: Any
    
    /* unmapped type */
    var duration: Any
    
    /* unmapped type */
    var getRenderingParameters: Any
    
    /* unmapped type */
    var presentUsingCurrentPrediction: Any
    
    /* unmapped type */
    var removedCameras: Any
    
    /* unmapped type */
    var updateCurrentPrediction: Any
    
    /* unmapped type */
    var waitForFrameToFinish: Any
  }
  object HolographicFrame {
    
    inline def apply(
      addedCameras: Any,
      currentPrediction: Any,
      duration: Any,
      getRenderingParameters: Any,
      presentUsingCurrentPrediction: Any,
      removedCameras: Any,
      updateCurrentPrediction: Any,
      waitForFrameToFinish: Any
    ): HolographicFrame = {
      val __obj = js.Dynamic.literal(addedCameras = addedCameras.asInstanceOf[js.Any], currentPrediction = currentPrediction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], getRenderingParameters = getRenderingParameters.asInstanceOf[js.Any], presentUsingCurrentPrediction = presentUsingCurrentPrediction.asInstanceOf[js.Any], removedCameras = removedCameras.asInstanceOf[js.Any], updateCurrentPrediction = updateCurrentPrediction.asInstanceOf[js.Any], waitForFrameToFinish = waitForFrameToFinish.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicFrame]
    }
    
    extension [Self <: HolographicFrame](x: Self) {
      
      inline def setAddedCameras(value: Any): Self = StObject.set(x, "addedCameras", value.asInstanceOf[js.Any])
      
      inline def setCurrentPrediction(value: Any): Self = StObject.set(x, "currentPrediction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setGetRenderingParameters(value: Any): Self = StObject.set(x, "getRenderingParameters", value.asInstanceOf[js.Any])
      
      inline def setPresentUsingCurrentPrediction(value: Any): Self = StObject.set(x, "presentUsingCurrentPrediction", value.asInstanceOf[js.Any])
      
      inline def setRemovedCameras(value: Any): Self = StObject.set(x, "removedCameras", value.asInstanceOf[js.Any])
      
      inline def setUpdateCurrentPrediction(value: Any): Self = StObject.set(x, "updateCurrentPrediction", value.asInstanceOf[js.Any])
      
      inline def setWaitForFrameToFinish(value: Any): Self = StObject.set(x, "waitForFrameToFinish", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicFramePrediction extends StObject {
    
    var cameraPoses: Any
    
    /* unmapped type */
    var timestamp: Any
  }
  object HolographicFramePrediction {
    
    inline def apply(cameraPoses: Any, timestamp: Any): HolographicFramePrediction = {
      val __obj = js.Dynamic.literal(cameraPoses = cameraPoses.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicFramePrediction]
    }
    
    extension [Self <: HolographicFramePrediction](x: Self) {
      
      inline def setCameraPoses(value: Any): Self = StObject.set(x, "cameraPoses", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicSpace extends StObject {
    
    /* unmapped type */
    var addEventListener: Any
    
    /* unmapped type */
    var createNextFrame: Any
    
    /* unmapped type */
    var oncameraadded: Any
    
    /* unmapped type */
    var oncameraremoved: Any
    
    /* unmapped type */
    var primaryAdapterId: Any
    
    /* unmapped type */
    var removeEventListener: Any
    
    /* unmapped type */
    var setDirect3D11Device: Any
  }
  object HolographicSpace {
    
    inline def apply(
      addEventListener: Any,
      createNextFrame: Any,
      oncameraadded: Any,
      oncameraremoved: Any,
      primaryAdapterId: Any,
      removeEventListener: Any,
      setDirect3D11Device: Any
    ): HolographicSpace = {
      val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], createNextFrame = createNextFrame.asInstanceOf[js.Any], oncameraadded = oncameraadded.asInstanceOf[js.Any], oncameraremoved = oncameraremoved.asInstanceOf[js.Any], primaryAdapterId = primaryAdapterId.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], setDirect3D11Device = setDirect3D11Device.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicSpace]
    }
    
    extension [Self <: HolographicSpace](x: Self) {
      
      inline def setAddEventListener(value: Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
      
      inline def setCreateNextFrame(value: Any): Self = StObject.set(x, "createNextFrame", value.asInstanceOf[js.Any])
      
      inline def setOncameraadded(value: Any): Self = StObject.set(x, "oncameraadded", value.asInstanceOf[js.Any])
      
      inline def setOncameraremoved(value: Any): Self = StObject.set(x, "oncameraremoved", value.asInstanceOf[js.Any])
      
      inline def setPrimaryAdapterId(value: Any): Self = StObject.set(x, "primaryAdapterId", value.asInstanceOf[js.Any])
      
      inline def setRemoveEventListener(value: Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
      
      inline def setSetDirect3D11Device(value: Any): Self = StObject.set(x, "setDirect3D11Device", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicSpaceCameraAddedEventArgs extends StObject {
    
    var camera: Any
    
    /* unmapped type */
    var getDeferral: Any
  }
  object HolographicSpaceCameraAddedEventArgs {
    
    inline def apply(camera: Any, getDeferral: Any): HolographicSpaceCameraAddedEventArgs = {
      val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], getDeferral = getDeferral.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicSpaceCameraAddedEventArgs]
    }
    
    extension [Self <: HolographicSpaceCameraAddedEventArgs](x: Self) {
      
      inline def setCamera(value: Any): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setGetDeferral(value: Any): Self = StObject.set(x, "getDeferral", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicSpaceCameraRemovedEventArgs extends StObject {
    
    var camera: Any
  }
  object HolographicSpaceCameraRemovedEventArgs {
    
    inline def apply(camera: Any): HolographicSpaceCameraRemovedEventArgs = {
      val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicSpaceCameraRemovedEventArgs]
    }
    
    extension [Self <: HolographicSpaceCameraRemovedEventArgs](x: Self) {
      
      inline def setCamera(value: Any): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    }
  }
}
