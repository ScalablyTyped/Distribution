package typings.winrtUwp.Windows.Graphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Holographic {
  
  trait HolographicCamera extends StObject {
    
    var id: js.Any
    
    /* unmapped type */
    var isStereo: js.Any
    
    /* unmapped type */
    var renderTargetSize: js.Any
    
    /* unmapped type */
    var setFarPlaneDistance: js.Any
    
    /* unmapped type */
    var setNearPlaneDistance: js.Any
    
    /* unmapped type */
    var viewportScaleFactor: js.Any
  }
  object HolographicCamera {
    
    @scala.inline
    def apply(
      id: js.Any,
      isStereo: js.Any,
      renderTargetSize: js.Any,
      setFarPlaneDistance: js.Any,
      setNearPlaneDistance: js.Any,
      viewportScaleFactor: js.Any
    ): HolographicCamera = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isStereo = isStereo.asInstanceOf[js.Any], renderTargetSize = renderTargetSize.asInstanceOf[js.Any], setFarPlaneDistance = setFarPlaneDistance.asInstanceOf[js.Any], setNearPlaneDistance = setNearPlaneDistance.asInstanceOf[js.Any], viewportScaleFactor = viewportScaleFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicCamera]
    }
    
    @scala.inline
    implicit class HolographicCameraMutableBuilder[Self <: HolographicCamera] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStereo(value: js.Any): Self = StObject.set(x, "isStereo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTargetSize(value: js.Any): Self = StObject.set(x, "renderTargetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFarPlaneDistance(value: js.Any): Self = StObject.set(x, "setFarPlaneDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetNearPlaneDistance(value: js.Any): Self = StObject.set(x, "setNearPlaneDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportScaleFactor(value: js.Any): Self = StObject.set(x, "viewportScaleFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicCameraPose extends StObject {
    
    var farPlaneDistance: js.Any
    
    /* unmapped type */
    var holographicCamera: js.Any
    
    /* unmapped type */
    var nearPlaneDistance: js.Any
    
    /* unmapped type */
    var projectionTransform: js.Any
    
    /* unmapped type */
    var tryGetCullingFrustum: js.Any
    
    /* unmapped type */
    var tryGetViewTransform: js.Any
    
    /* unmapped type */
    var tryGetVisibleFrustum: js.Any
    
    /* unmapped type */
    var viewport: js.Any
  }
  object HolographicCameraPose {
    
    @scala.inline
    def apply(
      farPlaneDistance: js.Any,
      holographicCamera: js.Any,
      nearPlaneDistance: js.Any,
      projectionTransform: js.Any,
      tryGetCullingFrustum: js.Any,
      tryGetViewTransform: js.Any,
      tryGetVisibleFrustum: js.Any,
      viewport: js.Any
    ): HolographicCameraPose = {
      val __obj = js.Dynamic.literal(farPlaneDistance = farPlaneDistance.asInstanceOf[js.Any], holographicCamera = holographicCamera.asInstanceOf[js.Any], nearPlaneDistance = nearPlaneDistance.asInstanceOf[js.Any], projectionTransform = projectionTransform.asInstanceOf[js.Any], tryGetCullingFrustum = tryGetCullingFrustum.asInstanceOf[js.Any], tryGetViewTransform = tryGetViewTransform.asInstanceOf[js.Any], tryGetVisibleFrustum = tryGetVisibleFrustum.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicCameraPose]
    }
    
    @scala.inline
    implicit class HolographicCameraPoseMutableBuilder[Self <: HolographicCameraPose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFarPlaneDistance(value: js.Any): Self = StObject.set(x, "farPlaneDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolographicCamera(value: js.Any): Self = StObject.set(x, "holographicCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearPlaneDistance(value: js.Any): Self = StObject.set(x, "nearPlaneDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionTransform(value: js.Any): Self = StObject.set(x, "projectionTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryGetCullingFrustum(value: js.Any): Self = StObject.set(x, "tryGetCullingFrustum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryGetViewTransform(value: js.Any): Self = StObject.set(x, "tryGetViewTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryGetVisibleFrustum(value: js.Any): Self = StObject.set(x, "tryGetVisibleFrustum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewport(value: js.Any): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicCameraRenderingParameters extends StObject {
    
    var direct3D11BackBuffer: js.Any
    
    /* unmapped type */
    var direct3D11Device: js.Any
    
    /* unmapped type */
    var setFocusPoint: js.Any
  }
  object HolographicCameraRenderingParameters {
    
    @scala.inline
    def apply(direct3D11BackBuffer: js.Any, direct3D11Device: js.Any, setFocusPoint: js.Any): HolographicCameraRenderingParameters = {
      val __obj = js.Dynamic.literal(direct3D11BackBuffer = direct3D11BackBuffer.asInstanceOf[js.Any], direct3D11Device = direct3D11Device.asInstanceOf[js.Any], setFocusPoint = setFocusPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicCameraRenderingParameters]
    }
    
    @scala.inline
    implicit class HolographicCameraRenderingParametersMutableBuilder[Self <: HolographicCameraRenderingParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirect3D11BackBuffer(value: js.Any): Self = StObject.set(x, "direct3D11BackBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirect3D11Device(value: js.Any): Self = StObject.set(x, "direct3D11Device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFocusPoint(value: js.Any): Self = StObject.set(x, "setFocusPoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicFrame extends StObject {
    
    var addedCameras: js.Any
    
    /* unmapped type */
    var currentPrediction: js.Any
    
    /* unmapped type */
    var duration: js.Any
    
    /* unmapped type */
    var getRenderingParameters: js.Any
    
    /* unmapped type */
    var presentUsingCurrentPrediction: js.Any
    
    /* unmapped type */
    var removedCameras: js.Any
    
    /* unmapped type */
    var updateCurrentPrediction: js.Any
    
    /* unmapped type */
    var waitForFrameToFinish: js.Any
  }
  object HolographicFrame {
    
    @scala.inline
    def apply(
      addedCameras: js.Any,
      currentPrediction: js.Any,
      duration: js.Any,
      getRenderingParameters: js.Any,
      presentUsingCurrentPrediction: js.Any,
      removedCameras: js.Any,
      updateCurrentPrediction: js.Any,
      waitForFrameToFinish: js.Any
    ): HolographicFrame = {
      val __obj = js.Dynamic.literal(addedCameras = addedCameras.asInstanceOf[js.Any], currentPrediction = currentPrediction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], getRenderingParameters = getRenderingParameters.asInstanceOf[js.Any], presentUsingCurrentPrediction = presentUsingCurrentPrediction.asInstanceOf[js.Any], removedCameras = removedCameras.asInstanceOf[js.Any], updateCurrentPrediction = updateCurrentPrediction.asInstanceOf[js.Any], waitForFrameToFinish = waitForFrameToFinish.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicFrame]
    }
    
    @scala.inline
    implicit class HolographicFrameMutableBuilder[Self <: HolographicFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddedCameras(value: js.Any): Self = StObject.set(x, "addedCameras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPrediction(value: js.Any): Self = StObject.set(x, "currentPrediction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetRenderingParameters(value: js.Any): Self = StObject.set(x, "getRenderingParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentUsingCurrentPrediction(value: js.Any): Self = StObject.set(x, "presentUsingCurrentPrediction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedCameras(value: js.Any): Self = StObject.set(x, "removedCameras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateCurrentPrediction(value: js.Any): Self = StObject.set(x, "updateCurrentPrediction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForFrameToFinish(value: js.Any): Self = StObject.set(x, "waitForFrameToFinish", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicFramePrediction extends StObject {
    
    var cameraPoses: js.Any
    
    /* unmapped type */
    var timestamp: js.Any
  }
  object HolographicFramePrediction {
    
    @scala.inline
    def apply(cameraPoses: js.Any, timestamp: js.Any): HolographicFramePrediction = {
      val __obj = js.Dynamic.literal(cameraPoses = cameraPoses.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicFramePrediction]
    }
    
    @scala.inline
    implicit class HolographicFramePredictionMutableBuilder[Self <: HolographicFramePrediction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCameraPoses(value: js.Any): Self = StObject.set(x, "cameraPoses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: js.Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicSpace extends StObject {
    
    /* unmapped type */
    var addEventListener: js.Any
    
    /* unmapped type */
    var createNextFrame: js.Any
    
    /* unmapped type */
    var oncameraadded: js.Any
    
    /* unmapped type */
    var oncameraremoved: js.Any
    
    /* unmapped type */
    var primaryAdapterId: js.Any
    
    /* unmapped type */
    var removeEventListener: js.Any
    
    /* unmapped type */
    var setDirect3D11Device: js.Any
  }
  object HolographicSpace {
    
    @scala.inline
    def apply(
      addEventListener: js.Any,
      createNextFrame: js.Any,
      oncameraadded: js.Any,
      oncameraremoved: js.Any,
      primaryAdapterId: js.Any,
      removeEventListener: js.Any,
      setDirect3D11Device: js.Any
    ): HolographicSpace = {
      val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], createNextFrame = createNextFrame.asInstanceOf[js.Any], oncameraadded = oncameraadded.asInstanceOf[js.Any], oncameraremoved = oncameraremoved.asInstanceOf[js.Any], primaryAdapterId = primaryAdapterId.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], setDirect3D11Device = setDirect3D11Device.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicSpace]
    }
    
    @scala.inline
    implicit class HolographicSpaceMutableBuilder[Self <: HolographicSpace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: js.Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateNextFrame(value: js.Any): Self = StObject.set(x, "createNextFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncameraadded(value: js.Any): Self = StObject.set(x, "oncameraadded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncameraremoved(value: js.Any): Self = StObject.set(x, "oncameraremoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryAdapterId(value: js.Any): Self = StObject.set(x, "primaryAdapterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEventListener(value: js.Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDirect3D11Device(value: js.Any): Self = StObject.set(x, "setDirect3D11Device", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicSpaceCameraAddedEventArgs extends StObject {
    
    var camera: js.Any
    
    /* unmapped type */
    var getDeferral: js.Any
  }
  object HolographicSpaceCameraAddedEventArgs {
    
    @scala.inline
    def apply(camera: js.Any, getDeferral: js.Any): HolographicSpaceCameraAddedEventArgs = {
      val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], getDeferral = getDeferral.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicSpaceCameraAddedEventArgs]
    }
    
    @scala.inline
    implicit class HolographicSpaceCameraAddedEventArgsMutableBuilder[Self <: HolographicSpaceCameraAddedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamera(value: js.Any): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDeferral(value: js.Any): Self = StObject.set(x, "getDeferral", value.asInstanceOf[js.Any])
    }
  }
  
  trait HolographicSpaceCameraRemovedEventArgs extends StObject {
    
    var camera: js.Any
  }
  object HolographicSpaceCameraRemovedEventArgs {
    
    @scala.inline
    def apply(camera: js.Any): HolographicSpaceCameraRemovedEventArgs = {
      val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolographicSpaceCameraRemovedEventArgs]
    }
    
    @scala.inline
    implicit class HolographicSpaceCameraRemovedEventArgsMutableBuilder[Self <: HolographicSpaceCameraRemovedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamera(value: js.Any): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    }
  }
}
