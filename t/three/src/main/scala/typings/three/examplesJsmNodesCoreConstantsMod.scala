package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.NodeOrType
import typings.three.threeStrings.`object`
import typings.three.threeStrings.bool
import typings.three.threeStrings.float
import typings.three.threeStrings.fragment
import typings.three.threeStrings.frame
import typings.three.threeStrings.int
import typings.three.threeStrings.mat3
import typings.three.threeStrings.mat4
import typings.three.threeStrings.none
import typings.three.threeStrings.render
import typings.three.threeStrings.vec2
import typings.three.threeStrings.vec3
import typings.three.threeStrings.vec4
import typings.three.threeStrings.vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreConstantsMod {
  
  object NodeShaderStage {
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeShaderStage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeShaderStage.FRAGMENT")
    @js.native
    def FRAGMENT: fragment = js.native
    inline def FRAGMENT_=(x: fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeShaderStage.VERTEX")
    @js.native
    def VERTEX: vertex = js.native
    inline def VERTEX_=(x: vertex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX")(x.asInstanceOf[js.Any])
  }
  
  object NodeType {
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType.BOOLEAN")
    @js.native
    def BOOLEAN: bool = js.native
    inline def BOOLEAN_=(x: bool): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType.FLOAT")
    @js.native
    def FLOAT: float = js.native
    inline def FLOAT_=(x: float): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLOAT")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType.INTEGER")
    @js.native
    def INTEGER: int = js.native
    inline def INTEGER_=(x: int): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType.MATRIX3")
    @js.native
    def MATRIX3: mat3 = js.native
    inline def MATRIX3_=(x: mat3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MATRIX3")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType.MATRIX4")
    @js.native
    def MATRIX4: mat4 = js.native
    inline def MATRIX4_=(x: mat4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MATRIX4")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType.VECTOR2")
    @js.native
    def VECTOR2: vec2 = js.native
    inline def VECTOR2_=(x: vec2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VECTOR2")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType.VECTOR3")
    @js.native
    def VECTOR3: vec3 = js.native
    inline def VECTOR3_=(x: vec3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VECTOR3")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeType.VECTOR4")
    @js.native
    def VECTOR4: vec4 = js.native
    inline def VECTOR4_=(x: vec4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VECTOR4")(x.asInstanceOf[js.Any])
  }
  
  object NodeUpdateType {
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeUpdateType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeUpdateType.FRAME")
    @js.native
    def FRAME: frame = js.native
    inline def FRAME_=(x: frame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeUpdateType.NONE")
    @js.native
    def NONE: none = js.native
    inline def NONE_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeUpdateType.OBJECT")
    @js.native
    def OBJECT: `object` = js.native
    inline def OBJECT_=(x: `object`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/core/constants", "NodeUpdateType.RENDER")
    @js.native
    def RENDER: render = js.native
    inline def RENDER_=(x: render): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RENDER")(x.asInstanceOf[js.Any])
  }
  
  type AnyJson = Any
  
  type AnyObject = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.vertex
    - typings.three.threeStrings.fragment
    - typings.three.threeStrings.compute
  */
  trait NodeShaderStageOption extends StObject
  object NodeShaderStageOption {
    
    inline def compute: typings.three.threeStrings.compute = "compute".asInstanceOf[typings.three.threeStrings.compute]
    
    inline def fragment: typings.three.threeStrings.fragment = "fragment".asInstanceOf[typings.three.threeStrings.fragment]
    
    inline def vertex: typings.three.threeStrings.vertex = "vertex".asInstanceOf[typings.three.threeStrings.vertex]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.bool
    - typings.three.threeStrings.int
    - typings.three.threeStrings.float
    - typings.three.threeStrings.vec2
    - typings.three.threeStrings.vec3
    - typings.three.threeStrings.vec4
    - typings.three.threeStrings.mat3
    - typings.three.threeStrings.mat4
    - typings.three.threeStrings.code
    - typings.three.threeStrings.color
    - typings.three.threeStrings.uint
    - typings.three.threeStrings.void
    - typings.three.threeStrings.property
    - typings.three.threeStrings.sampler
    - typings.three.threeStrings.texture
    - typings.three.threeStrings.cubeTexture
    - typings.three.threeStrings.ivec2
    - typings.three.threeStrings.uvec2
    - typings.three.threeStrings.bvec2
    - typings.three.threeStrings.ivec3
    - typings.three.threeStrings.uvec3
    - typings.three.threeStrings.bvec3
    - typings.three.threeStrings.ivec4
    - typings.three.threeStrings.uvec4
    - typings.three.threeStrings.bvec4
    - typings.three.threeStrings.imat3
    - typings.three.threeStrings.umat3
    - typings.three.threeStrings.bmat3
    - typings.three.threeStrings.imat4
    - typings.three.threeStrings.umat4
    - typings.three.threeStrings.bmat4
  */
  trait NodeTypeOption
    extends StObject
       with NodeOrType
  object NodeTypeOption {
    
    inline def bmat3: typings.three.threeStrings.bmat3 = "bmat3".asInstanceOf[typings.three.threeStrings.bmat3]
    
    inline def bmat4: typings.three.threeStrings.bmat4 = "bmat4".asInstanceOf[typings.three.threeStrings.bmat4]
    
    inline def bool: typings.three.threeStrings.bool = "bool".asInstanceOf[typings.three.threeStrings.bool]
    
    inline def bvec2: typings.three.threeStrings.bvec2 = "bvec2".asInstanceOf[typings.three.threeStrings.bvec2]
    
    inline def bvec3: typings.three.threeStrings.bvec3 = "bvec3".asInstanceOf[typings.three.threeStrings.bvec3]
    
    inline def bvec4: typings.three.threeStrings.bvec4 = "bvec4".asInstanceOf[typings.three.threeStrings.bvec4]
    
    inline def code: typings.three.threeStrings.code = "code".asInstanceOf[typings.three.threeStrings.code]
    
    inline def color: typings.three.threeStrings.color = "color".asInstanceOf[typings.three.threeStrings.color]
    
    inline def cubeTexture: typings.three.threeStrings.cubeTexture = "cubeTexture".asInstanceOf[typings.three.threeStrings.cubeTexture]
    
    inline def float: typings.three.threeStrings.float = "float".asInstanceOf[typings.three.threeStrings.float]
    
    inline def imat3: typings.three.threeStrings.imat3 = "imat3".asInstanceOf[typings.three.threeStrings.imat3]
    
    inline def imat4: typings.three.threeStrings.imat4 = "imat4".asInstanceOf[typings.three.threeStrings.imat4]
    
    inline def int: typings.three.threeStrings.int = "int".asInstanceOf[typings.three.threeStrings.int]
    
    inline def ivec2: typings.three.threeStrings.ivec2 = "ivec2".asInstanceOf[typings.three.threeStrings.ivec2]
    
    inline def ivec3: typings.three.threeStrings.ivec3 = "ivec3".asInstanceOf[typings.three.threeStrings.ivec3]
    
    inline def ivec4: typings.three.threeStrings.ivec4 = "ivec4".asInstanceOf[typings.three.threeStrings.ivec4]
    
    inline def mat3: typings.three.threeStrings.mat3 = "mat3".asInstanceOf[typings.three.threeStrings.mat3]
    
    inline def mat4: typings.three.threeStrings.mat4 = "mat4".asInstanceOf[typings.three.threeStrings.mat4]
    
    inline def property: typings.three.threeStrings.property = "property".asInstanceOf[typings.three.threeStrings.property]
    
    inline def sampler: typings.three.threeStrings.sampler = "sampler".asInstanceOf[typings.three.threeStrings.sampler]
    
    inline def texture: typings.three.threeStrings.texture = "texture".asInstanceOf[typings.three.threeStrings.texture]
    
    inline def uint: typings.three.threeStrings.uint = "uint".asInstanceOf[typings.three.threeStrings.uint]
    
    inline def umat3: typings.three.threeStrings.umat3 = "umat3".asInstanceOf[typings.three.threeStrings.umat3]
    
    inline def umat4: typings.three.threeStrings.umat4 = "umat4".asInstanceOf[typings.three.threeStrings.umat4]
    
    inline def uvec2: typings.three.threeStrings.uvec2 = "uvec2".asInstanceOf[typings.three.threeStrings.uvec2]
    
    inline def uvec3: typings.three.threeStrings.uvec3 = "uvec3".asInstanceOf[typings.three.threeStrings.uvec3]
    
    inline def uvec4: typings.three.threeStrings.uvec4 = "uvec4".asInstanceOf[typings.three.threeStrings.uvec4]
    
    inline def vec2: typings.three.threeStrings.vec2 = "vec2".asInstanceOf[typings.three.threeStrings.vec2]
    
    inline def vec3: typings.three.threeStrings.vec3 = "vec3".asInstanceOf[typings.three.threeStrings.vec3]
    
    inline def vec4: typings.three.threeStrings.vec4 = "vec4".asInstanceOf[typings.three.threeStrings.vec4]
    
    inline def void: typings.three.threeStrings.void = "void".asInstanceOf[typings.three.threeStrings.void]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.none
    - typings.three.threeStrings.frame
    - typings.three.threeStrings.`object`
  */
  trait NodeUpdateTypeOption extends StObject
  object NodeUpdateTypeOption {
    
    inline def frame: typings.three.threeStrings.frame = "frame".asInstanceOf[typings.three.threeStrings.frame]
    
    inline def none: typings.three.threeStrings.none = "none".asInstanceOf[typings.three.threeStrings.none]
    
    inline def `object`: typings.three.threeStrings.`object` = "object".asInstanceOf[typings.three.threeStrings.`object`]
  }
  
  type NodeUserData = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.srcThreeMod.Color
    - typings.three.srcThreeMod.Vector2
    - typings.three.srcThreeMod.Vector3
    - typings.three.srcThreeMod.Vector4
    - typings.three.srcThreeMod.Matrix3
    - typings.three.srcThreeMod.Matrix4
    - scala.Boolean
    - scala.Double
  */
  type NodeValueOption = _NodeValueOption | Boolean | Double
  
  type SwizzleOption = String
  
  trait _NodeValueOption extends StObject
}
