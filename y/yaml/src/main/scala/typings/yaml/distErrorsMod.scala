package typings.yaml

import typings.std.Error
import typings.yaml.distParseLineCounterMod.LineCounter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsMod {
  
  @JSImport("yaml/dist/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/errors", "YAMLError")
  @js.native
  open class YAMLError protected ()
    extends StObject
       with Error {
    def this(
      name: typings.yaml.yamlStrings.YAMLParseError | typings.yaml.yamlStrings.YAMLWarning,
      pos: js.Tuple2[Double, Double],
      code: ErrorCode,
      message: String
    ) = this()
    
    var code: ErrorCode = js.native
    
    var linePos: js.UndefOr[js.Array[LinePos] | (js.Tuple2[LinePos, LinePos])] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_YAMLError: typings.yaml.yamlStrings.YAMLParseError | typings.yaml.yamlStrings.YAMLWarning = js.native
    
    var pos: js.Tuple2[Double, Double] = js.native
  }
  
  @JSImport("yaml/dist/errors", "YAMLParseError")
  @js.native
  open class YAMLParseError protected () extends YAMLError {
    def this(pos: js.Tuple2[Double, Double], code: ErrorCode, message: String) = this()
  }
  
  @JSImport("yaml/dist/errors", "YAMLWarning")
  @js.native
  open class YAMLWarning protected () extends YAMLError {
    def this(pos: js.Tuple2[Double, Double], code: ErrorCode, message: String) = this()
  }
  
  inline def prettifyError(src: String, lc: LineCounter): js.Function1[/* error */ YAMLError, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("prettifyError")(src.asInstanceOf[js.Any], lc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* error */ YAMLError, Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.yaml.yamlStrings.ALIAS_PROPS
    - typings.yaml.yamlStrings.BAD_ALIAS
    - typings.yaml.yamlStrings.BAD_DIRECTIVE
    - typings.yaml.yamlStrings.BAD_DQ_ESCAPE
    - typings.yaml.yamlStrings.BAD_INDENT
    - typings.yaml.yamlStrings.BAD_PROP_ORDER
    - typings.yaml.yamlStrings.BAD_SCALAR_START
    - typings.yaml.yamlStrings.BLOCK_AS_IMPLICIT_KEY
    - typings.yaml.yamlStrings.BLOCK_IN_FLOW
    - typings.yaml.yamlStrings.DUPLICATE_KEY
    - typings.yaml.yamlStrings.IMPOSSIBLE
    - typings.yaml.yamlStrings.KEY_OVER_1024_CHARS
    - typings.yaml.yamlStrings.MISSING_CHAR
    - typings.yaml.yamlStrings.MULTILINE_IMPLICIT_KEY
    - typings.yaml.yamlStrings.MULTIPLE_ANCHORS
    - typings.yaml.yamlStrings.MULTIPLE_DOCS
    - typings.yaml.yamlStrings.MULTIPLE_TAGS
    - typings.yaml.yamlStrings.TAB_AS_INDENT
    - typings.yaml.yamlStrings.TAG_RESOLVE_FAILED
    - typings.yaml.yamlStrings.UNEXPECTED_TOKEN
    - typings.yaml.yamlStrings.BAD_COLLECTION_TYPE
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def ALIAS_PROPS: typings.yaml.yamlStrings.ALIAS_PROPS = "ALIAS_PROPS".asInstanceOf[typings.yaml.yamlStrings.ALIAS_PROPS]
    
    inline def BAD_ALIAS: typings.yaml.yamlStrings.BAD_ALIAS = "BAD_ALIAS".asInstanceOf[typings.yaml.yamlStrings.BAD_ALIAS]
    
    inline def BAD_COLLECTION_TYPE: typings.yaml.yamlStrings.BAD_COLLECTION_TYPE = "BAD_COLLECTION_TYPE".asInstanceOf[typings.yaml.yamlStrings.BAD_COLLECTION_TYPE]
    
    inline def BAD_DIRECTIVE: typings.yaml.yamlStrings.BAD_DIRECTIVE = "BAD_DIRECTIVE".asInstanceOf[typings.yaml.yamlStrings.BAD_DIRECTIVE]
    
    inline def BAD_DQ_ESCAPE: typings.yaml.yamlStrings.BAD_DQ_ESCAPE = "BAD_DQ_ESCAPE".asInstanceOf[typings.yaml.yamlStrings.BAD_DQ_ESCAPE]
    
    inline def BAD_INDENT: typings.yaml.yamlStrings.BAD_INDENT = "BAD_INDENT".asInstanceOf[typings.yaml.yamlStrings.BAD_INDENT]
    
    inline def BAD_PROP_ORDER: typings.yaml.yamlStrings.BAD_PROP_ORDER = "BAD_PROP_ORDER".asInstanceOf[typings.yaml.yamlStrings.BAD_PROP_ORDER]
    
    inline def BAD_SCALAR_START: typings.yaml.yamlStrings.BAD_SCALAR_START = "BAD_SCALAR_START".asInstanceOf[typings.yaml.yamlStrings.BAD_SCALAR_START]
    
    inline def BLOCK_AS_IMPLICIT_KEY: typings.yaml.yamlStrings.BLOCK_AS_IMPLICIT_KEY = "BLOCK_AS_IMPLICIT_KEY".asInstanceOf[typings.yaml.yamlStrings.BLOCK_AS_IMPLICIT_KEY]
    
    inline def BLOCK_IN_FLOW: typings.yaml.yamlStrings.BLOCK_IN_FLOW = "BLOCK_IN_FLOW".asInstanceOf[typings.yaml.yamlStrings.BLOCK_IN_FLOW]
    
    inline def DUPLICATE_KEY: typings.yaml.yamlStrings.DUPLICATE_KEY = "DUPLICATE_KEY".asInstanceOf[typings.yaml.yamlStrings.DUPLICATE_KEY]
    
    inline def IMPOSSIBLE: typings.yaml.yamlStrings.IMPOSSIBLE = "IMPOSSIBLE".asInstanceOf[typings.yaml.yamlStrings.IMPOSSIBLE]
    
    inline def KEY_OVER_1024_CHARS: typings.yaml.yamlStrings.KEY_OVER_1024_CHARS = "KEY_OVER_1024_CHARS".asInstanceOf[typings.yaml.yamlStrings.KEY_OVER_1024_CHARS]
    
    inline def MISSING_CHAR: typings.yaml.yamlStrings.MISSING_CHAR = "MISSING_CHAR".asInstanceOf[typings.yaml.yamlStrings.MISSING_CHAR]
    
    inline def MULTILINE_IMPLICIT_KEY: typings.yaml.yamlStrings.MULTILINE_IMPLICIT_KEY = "MULTILINE_IMPLICIT_KEY".asInstanceOf[typings.yaml.yamlStrings.MULTILINE_IMPLICIT_KEY]
    
    inline def MULTIPLE_ANCHORS: typings.yaml.yamlStrings.MULTIPLE_ANCHORS = "MULTIPLE_ANCHORS".asInstanceOf[typings.yaml.yamlStrings.MULTIPLE_ANCHORS]
    
    inline def MULTIPLE_DOCS: typings.yaml.yamlStrings.MULTIPLE_DOCS = "MULTIPLE_DOCS".asInstanceOf[typings.yaml.yamlStrings.MULTIPLE_DOCS]
    
    inline def MULTIPLE_TAGS: typings.yaml.yamlStrings.MULTIPLE_TAGS = "MULTIPLE_TAGS".asInstanceOf[typings.yaml.yamlStrings.MULTIPLE_TAGS]
    
    inline def TAB_AS_INDENT: typings.yaml.yamlStrings.TAB_AS_INDENT = "TAB_AS_INDENT".asInstanceOf[typings.yaml.yamlStrings.TAB_AS_INDENT]
    
    inline def TAG_RESOLVE_FAILED: typings.yaml.yamlStrings.TAG_RESOLVE_FAILED = "TAG_RESOLVE_FAILED".asInstanceOf[typings.yaml.yamlStrings.TAG_RESOLVE_FAILED]
    
    inline def UNEXPECTED_TOKEN: typings.yaml.yamlStrings.UNEXPECTED_TOKEN = "UNEXPECTED_TOKEN".asInstanceOf[typings.yaml.yamlStrings.UNEXPECTED_TOKEN]
  }
  
  trait LinePos extends StObject {
    
    var col: Double
    
    var line: Double
  }
  object LinePos {
    
    inline def apply(col: Double, line: Double): LinePos = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinePos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinePos] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
