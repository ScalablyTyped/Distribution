package typings.winrtUwp.Windows.Graphics.DirectX

import typings.winrtUwp.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides Windows Runtime projections of Microsoft Direct3D APIs to enable Windows Runtime components to exchange Direct3D surfaces and devices. */
object Direct3D11 {
  
  @js.native
  sealed trait Direct3DBindings extends StObject
  /** A Windows Runtime projection of the D3D11_BIND_FLAG enumeration. Identifies the ways in which a resource may be bound to the graphics pipeline. */
  @JSGlobal("Windows.Graphics.DirectX.Direct3D11.Direct3DBindings")
  @js.native
  object Direct3DBindings extends StObject {
    
    /** Bind a buffer as a constant buffer to a shader stage. */
    @js.native
    sealed trait constantBuffer
      extends StObject
         with Direct3DBindings
    
    /** Set this flag to indicate that a 2D texture is used to receive output from the decoder API. */
    @js.native
    sealed trait decoder
      extends StObject
         with Direct3DBindings
    
    /** Bind a texture as a depth-stencil target for the output-merger stage. */
    @js.native
    sealed trait depthStencil
      extends StObject
         with Direct3DBindings
    
    /** Bind a buffer as an index buffer to the input-assembler stage. */
    @js.native
    sealed trait indexBuffer
      extends StObject
         with Direct3DBindings
    
    /** Bind a texture as a render target for the output-merger stage. */
    @js.native
    sealed trait renderTarget
      extends StObject
         with Direct3DBindings
    
    /** Bind a buffer or texture to a shader stage. */
    @js.native
    sealed trait shaderResource
      extends StObject
         with Direct3DBindings
    
    /** Bind an output buffer for the stream-output stage. */
    @js.native
    sealed trait streamOutput
      extends StObject
         with Direct3DBindings
    
    /** Bind an unordered access resource. */
    @js.native
    sealed trait unorderedAccess
      extends StObject
         with Direct3DBindings
    
    /** Bind a buffer as a vertex buffer to the input-assembler stage. */
    @js.native
    sealed trait vertexBuffer
      extends StObject
         with Direct3DBindings
    
    /** Set this flag to indicate that a 2D texture is used to receive input from the video encoder API. */
    @js.native
    sealed trait videoEncoder
      extends StObject
         with Direct3DBindings
  }
  
  @js.native
  sealed trait Direct3DUsage extends StObject
  /** A Windows Runtime projection of the D3D11_USAGE enumeration. Identifies expected resource use during rendering. The usage directly reflects whether a resource is accessible by the CPU and/or the graphics processing unit (GPU). */
  @JSGlobal("Windows.Graphics.DirectX.Direct3D11.Direct3DUsage")
  @js.native
  object Direct3DUsage extends StObject {
    
    /** A resource that requires read and write access by the GPU. */
    @js.native
    sealed trait default
      extends StObject
         with Direct3DUsage
    
    /** A resource that is accessible by both the GPU (read only) and the CPU (write only). A dynamic resource is a good choice for a resource that will be updated by the CPU at least once per frame. */
    @js.native
    sealed trait dynamic
      extends StObject
         with Direct3DUsage
    
    /** A resource that can only be read by the GPU. It cannot be written by the GPU, and cannot be accessed at all by the CPU. This type of resource must be initialized when it is created, since it cannot be changed after creation. */
    @js.native
    sealed trait immutable
      extends StObject
         with Direct3DUsage
    
    /** A resource that supports data transfer (copy) from the GPU to the CPU. */
    @js.native
    sealed trait staging
      extends StObject
         with Direct3DUsage
  }
  
  /** A Windows Runtime projection of the DXGI_SAMPLE_DESC structure. Describes multi-sampling parameters for a IDirect3DSurface . */
  trait Direct3DMultisampleDescription extends StObject {
    
    /** The number of multisamples per pixel. */
    var count: Double
    
    /** The image quality level. The higher the quality, the lower the performance. */
    var quality: Double
  }
  object Direct3DMultisampleDescription {
    
    @scala.inline
    def apply(count: Double, quality: Double): Direct3DMultisampleDescription = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direct3DMultisampleDescription]
    }
    
    @scala.inline
    implicit class Direct3DMultisampleDescriptionMutableBuilder[Self <: Direct3DMultisampleDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
  
  /** A Windows Runtime projection of the DXGI_SURFACE_DESC structure. Describes a IDirect3DSurface . */
  trait Direct3DSurfaceDescription extends StObject {
    
    /** Pixel format of the surface. */
    var format: DirectXPixelFormat
    
    /** Height of the surface. */
    var height: Double
    
    /** Multi-sampling parameters for the surface. */
    var multisampleDescription: Direct3DMultisampleDescription
    
    /** Width of the surface. */
    var width: Double
  }
  object Direct3DSurfaceDescription {
    
    @scala.inline
    def apply(
      format: DirectXPixelFormat,
      height: Double,
      multisampleDescription: Direct3DMultisampleDescription,
      width: Double
    ): Direct3DSurfaceDescription = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], multisampleDescription = multisampleDescription.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direct3DSurfaceDescription]
    }
    
    @scala.inline
    implicit class Direct3DSurfaceDescriptionMutableBuilder[Self <: Direct3DSurfaceDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: DirectXPixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultisampleDescription(value: Direct3DMultisampleDescription): Self = StObject.set(x, "multisampleDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /** This represents an IDXGISurface and can be used to interop between Windows Runtime components that need to exchange IDXGISurface references. */
  trait IDirect3DSurface
    extends StObject
       with IClosable {
    
    /** Gets a Direct3DSurfaceDescription describing the surface. */
    var description: Direct3DSurfaceDescription
  }
  object IDirect3DSurface {
    
    @scala.inline
    def apply(close: () => Unit, description: Direct3DSurfaceDescription): IDirect3DSurface = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDirect3DSurface]
    }
    
    @scala.inline
    implicit class IDirect3DSurfaceMutableBuilder[Self <: IDirect3DSurface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Direct3DSurfaceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
}
