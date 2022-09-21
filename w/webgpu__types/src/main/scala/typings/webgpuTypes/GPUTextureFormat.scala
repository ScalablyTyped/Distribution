package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webgpuTypes.webgpuTypesStrings.r8unorm
  - typings.webgpuTypes.webgpuTypesStrings.r8snorm
  - typings.webgpuTypes.webgpuTypesStrings.r8uint
  - typings.webgpuTypes.webgpuTypesStrings.r8sint
  - typings.webgpuTypes.webgpuTypesStrings.r16uint
  - typings.webgpuTypes.webgpuTypesStrings.r16sint
  - typings.webgpuTypes.webgpuTypesStrings.r16float
  - typings.webgpuTypes.webgpuTypesStrings.rg8unorm
  - typings.webgpuTypes.webgpuTypesStrings.rg8snorm
  - typings.webgpuTypes.webgpuTypesStrings.rg8uint
  - typings.webgpuTypes.webgpuTypesStrings.rg8sint
  - typings.webgpuTypes.webgpuTypesStrings.r32uint
  - typings.webgpuTypes.webgpuTypesStrings.r32sint
  - typings.webgpuTypes.webgpuTypesStrings.r32float
  - typings.webgpuTypes.webgpuTypesStrings.rg16uint
  - typings.webgpuTypes.webgpuTypesStrings.rg16sint
  - typings.webgpuTypes.webgpuTypesStrings.rg16float
  - typings.webgpuTypes.webgpuTypesStrings.rgba8unorm
  - typings.webgpuTypes.webgpuTypesStrings.`rgba8unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.rgba8snorm
  - typings.webgpuTypes.webgpuTypesStrings.rgba8uint
  - typings.webgpuTypes.webgpuTypesStrings.rgba8sint
  - typings.webgpuTypes.webgpuTypesStrings.bgra8unorm
  - typings.webgpuTypes.webgpuTypesStrings.`bgra8unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.rgb9e5ufloat
  - typings.webgpuTypes.webgpuTypesStrings.rgb10a2unorm
  - typings.webgpuTypes.webgpuTypesStrings.rg11b10ufloat
  - typings.webgpuTypes.webgpuTypesStrings.rg32uint
  - typings.webgpuTypes.webgpuTypesStrings.rg32sint
  - typings.webgpuTypes.webgpuTypesStrings.rg32float
  - typings.webgpuTypes.webgpuTypesStrings.rgba16uint
  - typings.webgpuTypes.webgpuTypesStrings.rgba16sint
  - typings.webgpuTypes.webgpuTypesStrings.rgba16float
  - typings.webgpuTypes.webgpuTypesStrings.rgba32uint
  - typings.webgpuTypes.webgpuTypesStrings.rgba32sint
  - typings.webgpuTypes.webgpuTypesStrings.rgba32float
  - typings.webgpuTypes.webgpuTypesStrings.stencil8
  - typings.webgpuTypes.webgpuTypesStrings.depth16unorm
  - typings.webgpuTypes.webgpuTypesStrings.depth24plus
  - typings.webgpuTypes.webgpuTypesStrings.`depth24plus-stencil8`
  - typings.webgpuTypes.webgpuTypesStrings.depth32float
  - typings.webgpuTypes.webgpuTypesStrings.`depth32float-stencil8`
  - typings.webgpuTypes.webgpuTypesStrings.`bc1-rgba-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`bc1-rgba-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`bc2-rgba-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`bc2-rgba-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`bc3-rgba-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`bc3-rgba-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`bc4-r-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`bc4-r-snorm`
  - typings.webgpuTypes.webgpuTypesStrings.`bc5-rg-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`bc5-rg-snorm`
  - typings.webgpuTypes.webgpuTypesStrings.`bc6h-rgb-ufloat`
  - typings.webgpuTypes.webgpuTypesStrings.`bc6h-rgb-float`
  - typings.webgpuTypes.webgpuTypesStrings.`bc7-rgba-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`bc7-rgba-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8a1unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8a1unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`etc2-rgba8unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`etc2-rgba8unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`eac-r11unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`eac-r11snorm`
  - typings.webgpuTypes.webgpuTypesStrings.`eac-rg11unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`eac-rg11snorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-4x4-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-4x4-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-5x4-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-5x4-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-5x5-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-5x5-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-6x5-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-6x5-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-6x6-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-6x6-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-8x5-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-8x5-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-8x6-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-8x6-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-8x8-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-8x8-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-10x5-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-10x5-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-10x6-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-10x6-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-10x8-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-10x8-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-10x10-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-10x10-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-12x10-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-12x10-unorm-srgb`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-12x12-unorm`
  - typings.webgpuTypes.webgpuTypesStrings.`astc-12x12-unorm-srgb`
*/
trait GPUTextureFormat extends StObject
object GPUTextureFormat {
  
  inline def `astc-10x10-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-10x10-unorm` = "astc-10x10-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-10x10-unorm`]
  
  inline def `astc-10x10-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-10x10-unorm-srgb` = "astc-10x10-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-10x10-unorm-srgb`]
  
  inline def `astc-10x5-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-10x5-unorm` = "astc-10x5-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-10x5-unorm`]
  
  inline def `astc-10x5-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-10x5-unorm-srgb` = "astc-10x5-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-10x5-unorm-srgb`]
  
  inline def `astc-10x6-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-10x6-unorm` = "astc-10x6-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-10x6-unorm`]
  
  inline def `astc-10x6-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-10x6-unorm-srgb` = "astc-10x6-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-10x6-unorm-srgb`]
  
  inline def `astc-10x8-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-10x8-unorm` = "astc-10x8-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-10x8-unorm`]
  
  inline def `astc-10x8-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-10x8-unorm-srgb` = "astc-10x8-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-10x8-unorm-srgb`]
  
  inline def `astc-12x10-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-12x10-unorm` = "astc-12x10-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-12x10-unorm`]
  
  inline def `astc-12x10-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-12x10-unorm-srgb` = "astc-12x10-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-12x10-unorm-srgb`]
  
  inline def `astc-12x12-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-12x12-unorm` = "astc-12x12-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-12x12-unorm`]
  
  inline def `astc-12x12-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-12x12-unorm-srgb` = "astc-12x12-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-12x12-unorm-srgb`]
  
  inline def `astc-4x4-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-4x4-unorm` = "astc-4x4-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-4x4-unorm`]
  
  inline def `astc-4x4-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-4x4-unorm-srgb` = "astc-4x4-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-4x4-unorm-srgb`]
  
  inline def `astc-5x4-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-5x4-unorm` = "astc-5x4-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-5x4-unorm`]
  
  inline def `astc-5x4-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-5x4-unorm-srgb` = "astc-5x4-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-5x4-unorm-srgb`]
  
  inline def `astc-5x5-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-5x5-unorm` = "astc-5x5-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-5x5-unorm`]
  
  inline def `astc-5x5-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-5x5-unorm-srgb` = "astc-5x5-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-5x5-unorm-srgb`]
  
  inline def `astc-6x5-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-6x5-unorm` = "astc-6x5-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-6x5-unorm`]
  
  inline def `astc-6x5-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-6x5-unorm-srgb` = "astc-6x5-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-6x5-unorm-srgb`]
  
  inline def `astc-6x6-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-6x6-unorm` = "astc-6x6-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-6x6-unorm`]
  
  inline def `astc-6x6-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-6x6-unorm-srgb` = "astc-6x6-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-6x6-unorm-srgb`]
  
  inline def `astc-8x5-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-8x5-unorm` = "astc-8x5-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-8x5-unorm`]
  
  inline def `astc-8x5-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-8x5-unorm-srgb` = "astc-8x5-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-8x5-unorm-srgb`]
  
  inline def `astc-8x6-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-8x6-unorm` = "astc-8x6-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-8x6-unorm`]
  
  inline def `astc-8x6-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-8x6-unorm-srgb` = "astc-8x6-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-8x6-unorm-srgb`]
  
  inline def `astc-8x8-unorm`: typings.webgpuTypes.webgpuTypesStrings.`astc-8x8-unorm` = "astc-8x8-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-8x8-unorm`]
  
  inline def `astc-8x8-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`astc-8x8-unorm-srgb` = "astc-8x8-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`astc-8x8-unorm-srgb`]
  
  inline def `bc1-rgba-unorm`: typings.webgpuTypes.webgpuTypesStrings.`bc1-rgba-unorm` = "bc1-rgba-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc1-rgba-unorm`]
  
  inline def `bc1-rgba-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`bc1-rgba-unorm-srgb` = "bc1-rgba-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc1-rgba-unorm-srgb`]
  
  inline def `bc2-rgba-unorm`: typings.webgpuTypes.webgpuTypesStrings.`bc2-rgba-unorm` = "bc2-rgba-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc2-rgba-unorm`]
  
  inline def `bc2-rgba-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`bc2-rgba-unorm-srgb` = "bc2-rgba-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc2-rgba-unorm-srgb`]
  
  inline def `bc3-rgba-unorm`: typings.webgpuTypes.webgpuTypesStrings.`bc3-rgba-unorm` = "bc3-rgba-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc3-rgba-unorm`]
  
  inline def `bc3-rgba-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`bc3-rgba-unorm-srgb` = "bc3-rgba-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc3-rgba-unorm-srgb`]
  
  inline def `bc4-r-snorm`: typings.webgpuTypes.webgpuTypesStrings.`bc4-r-snorm` = "bc4-r-snorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc4-r-snorm`]
  
  inline def `bc4-r-unorm`: typings.webgpuTypes.webgpuTypesStrings.`bc4-r-unorm` = "bc4-r-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc4-r-unorm`]
  
  inline def `bc5-rg-snorm`: typings.webgpuTypes.webgpuTypesStrings.`bc5-rg-snorm` = "bc5-rg-snorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc5-rg-snorm`]
  
  inline def `bc5-rg-unorm`: typings.webgpuTypes.webgpuTypesStrings.`bc5-rg-unorm` = "bc5-rg-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc5-rg-unorm`]
  
  inline def `bc6h-rgb-float`: typings.webgpuTypes.webgpuTypesStrings.`bc6h-rgb-float` = "bc6h-rgb-float".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc6h-rgb-float`]
  
  inline def `bc6h-rgb-ufloat`: typings.webgpuTypes.webgpuTypesStrings.`bc6h-rgb-ufloat` = "bc6h-rgb-ufloat".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc6h-rgb-ufloat`]
  
  inline def `bc7-rgba-unorm`: typings.webgpuTypes.webgpuTypesStrings.`bc7-rgba-unorm` = "bc7-rgba-unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc7-rgba-unorm`]
  
  inline def `bc7-rgba-unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`bc7-rgba-unorm-srgb` = "bc7-rgba-unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bc7-rgba-unorm-srgb`]
  
  inline def bgra8unorm: typings.webgpuTypes.webgpuTypesStrings.bgra8unorm = "bgra8unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.bgra8unorm]
  
  inline def `bgra8unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`bgra8unorm-srgb` = "bgra8unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`bgra8unorm-srgb`]
  
  inline def depth16unorm: typings.webgpuTypes.webgpuTypesStrings.depth16unorm = "depth16unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.depth16unorm]
  
  inline def depth24plus: typings.webgpuTypes.webgpuTypesStrings.depth24plus = "depth24plus".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.depth24plus]
  
  inline def `depth24plus-stencil8`: typings.webgpuTypes.webgpuTypesStrings.`depth24plus-stencil8` = "depth24plus-stencil8".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`depth24plus-stencil8`]
  
  inline def depth32float: typings.webgpuTypes.webgpuTypesStrings.depth32float = "depth32float".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.depth32float]
  
  inline def `depth32float-stencil8`: typings.webgpuTypes.webgpuTypesStrings.`depth32float-stencil8` = "depth32float-stencil8".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`depth32float-stencil8`]
  
  inline def `eac-r11snorm`: typings.webgpuTypes.webgpuTypesStrings.`eac-r11snorm` = "eac-r11snorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`eac-r11snorm`]
  
  inline def `eac-r11unorm`: typings.webgpuTypes.webgpuTypesStrings.`eac-r11unorm` = "eac-r11unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`eac-r11unorm`]
  
  inline def `eac-rg11snorm`: typings.webgpuTypes.webgpuTypesStrings.`eac-rg11snorm` = "eac-rg11snorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`eac-rg11snorm`]
  
  inline def `eac-rg11unorm`: typings.webgpuTypes.webgpuTypesStrings.`eac-rg11unorm` = "eac-rg11unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`eac-rg11unorm`]
  
  inline def `etc2-rgb8a1unorm`: typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8a1unorm` = "etc2-rgb8a1unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8a1unorm`]
  
  inline def `etc2-rgb8a1unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8a1unorm-srgb` = "etc2-rgb8a1unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8a1unorm-srgb`]
  
  inline def `etc2-rgb8unorm`: typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8unorm` = "etc2-rgb8unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8unorm`]
  
  inline def `etc2-rgb8unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8unorm-srgb` = "etc2-rgb8unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`etc2-rgb8unorm-srgb`]
  
  inline def `etc2-rgba8unorm`: typings.webgpuTypes.webgpuTypesStrings.`etc2-rgba8unorm` = "etc2-rgba8unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`etc2-rgba8unorm`]
  
  inline def `etc2-rgba8unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`etc2-rgba8unorm-srgb` = "etc2-rgba8unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`etc2-rgba8unorm-srgb`]
  
  inline def r16float: typings.webgpuTypes.webgpuTypesStrings.r16float = "r16float".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r16float]
  
  inline def r16sint: typings.webgpuTypes.webgpuTypesStrings.r16sint = "r16sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r16sint]
  
  inline def r16uint: typings.webgpuTypes.webgpuTypesStrings.r16uint = "r16uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r16uint]
  
  inline def r32float: typings.webgpuTypes.webgpuTypesStrings.r32float = "r32float".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r32float]
  
  inline def r32sint: typings.webgpuTypes.webgpuTypesStrings.r32sint = "r32sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r32sint]
  
  inline def r32uint: typings.webgpuTypes.webgpuTypesStrings.r32uint = "r32uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r32uint]
  
  inline def r8sint: typings.webgpuTypes.webgpuTypesStrings.r8sint = "r8sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r8sint]
  
  inline def r8snorm: typings.webgpuTypes.webgpuTypesStrings.r8snorm = "r8snorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r8snorm]
  
  inline def r8uint: typings.webgpuTypes.webgpuTypesStrings.r8uint = "r8uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r8uint]
  
  inline def r8unorm: typings.webgpuTypes.webgpuTypesStrings.r8unorm = "r8unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.r8unorm]
  
  inline def rg11b10ufloat: typings.webgpuTypes.webgpuTypesStrings.rg11b10ufloat = "rg11b10ufloat".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg11b10ufloat]
  
  inline def rg16float: typings.webgpuTypes.webgpuTypesStrings.rg16float = "rg16float".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg16float]
  
  inline def rg16sint: typings.webgpuTypes.webgpuTypesStrings.rg16sint = "rg16sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg16sint]
  
  inline def rg16uint: typings.webgpuTypes.webgpuTypesStrings.rg16uint = "rg16uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg16uint]
  
  inline def rg32float: typings.webgpuTypes.webgpuTypesStrings.rg32float = "rg32float".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg32float]
  
  inline def rg32sint: typings.webgpuTypes.webgpuTypesStrings.rg32sint = "rg32sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg32sint]
  
  inline def rg32uint: typings.webgpuTypes.webgpuTypesStrings.rg32uint = "rg32uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg32uint]
  
  inline def rg8sint: typings.webgpuTypes.webgpuTypesStrings.rg8sint = "rg8sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg8sint]
  
  inline def rg8snorm: typings.webgpuTypes.webgpuTypesStrings.rg8snorm = "rg8snorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg8snorm]
  
  inline def rg8uint: typings.webgpuTypes.webgpuTypesStrings.rg8uint = "rg8uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg8uint]
  
  inline def rg8unorm: typings.webgpuTypes.webgpuTypesStrings.rg8unorm = "rg8unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rg8unorm]
  
  inline def rgb10a2unorm: typings.webgpuTypes.webgpuTypesStrings.rgb10a2unorm = "rgb10a2unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgb10a2unorm]
  
  inline def rgb9e5ufloat: typings.webgpuTypes.webgpuTypesStrings.rgb9e5ufloat = "rgb9e5ufloat".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgb9e5ufloat]
  
  inline def rgba16float: typings.webgpuTypes.webgpuTypesStrings.rgba16float = "rgba16float".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba16float]
  
  inline def rgba16sint: typings.webgpuTypes.webgpuTypesStrings.rgba16sint = "rgba16sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba16sint]
  
  inline def rgba16uint: typings.webgpuTypes.webgpuTypesStrings.rgba16uint = "rgba16uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba16uint]
  
  inline def rgba32float: typings.webgpuTypes.webgpuTypesStrings.rgba32float = "rgba32float".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba32float]
  
  inline def rgba32sint: typings.webgpuTypes.webgpuTypesStrings.rgba32sint = "rgba32sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba32sint]
  
  inline def rgba32uint: typings.webgpuTypes.webgpuTypesStrings.rgba32uint = "rgba32uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba32uint]
  
  inline def rgba8sint: typings.webgpuTypes.webgpuTypesStrings.rgba8sint = "rgba8sint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba8sint]
  
  inline def rgba8snorm: typings.webgpuTypes.webgpuTypesStrings.rgba8snorm = "rgba8snorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba8snorm]
  
  inline def rgba8uint: typings.webgpuTypes.webgpuTypesStrings.rgba8uint = "rgba8uint".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba8uint]
  
  inline def rgba8unorm: typings.webgpuTypes.webgpuTypesStrings.rgba8unorm = "rgba8unorm".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.rgba8unorm]
  
  inline def `rgba8unorm-srgb`: typings.webgpuTypes.webgpuTypesStrings.`rgba8unorm-srgb` = "rgba8unorm-srgb".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.`rgba8unorm-srgb`]
  
  inline def stencil8: typings.webgpuTypes.webgpuTypesStrings.stencil8 = "stencil8".asInstanceOf[typings.webgpuTypes.webgpuTypesStrings.stencil8]
}
