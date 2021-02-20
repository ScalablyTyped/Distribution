package typings.xmlCore

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @js.native
  sealed trait XE extends StObject
  @JSImport("xml-core/dist/types/error", "XE")
  @js.native
  object XE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XE with Double] = js.native
    
    @js.native
    sealed trait ALGORITHM_NOT_SUPPORTED extends XE
    /* 16 */ val ALGORITHM_NOT_SUPPORTED: typings.xmlCore.errorMod.XE.ALGORITHM_NOT_SUPPORTED with Double = js.native
    
    @js.native
    sealed trait ALGORITHM_WRONG_NAME extends XE
    /* 17 */ val ALGORITHM_WRONG_NAME: typings.xmlCore.errorMod.XE.ALGORITHM_WRONG_NAME with Double = js.native
    
    @js.native
    sealed trait ATTRIBUTE_MISSING extends XE
    /* 11 */ val ATTRIBUTE_MISSING: typings.xmlCore.errorMod.XE.ATTRIBUTE_MISSING with Double = js.native
    
    @js.native
    sealed trait COLLECTION_LIMIT extends XE
    /* 4 */ val COLLECTION_LIMIT: typings.xmlCore.errorMod.XE.COLLECTION_LIMIT with Double = js.native
    
    @js.native
    sealed trait CONTENT_MISSING extends XE
    /* 12 */ val CONTENT_MISSING: typings.xmlCore.errorMod.XE.CONTENT_MISSING with Double = js.native
    
    @js.native
    sealed trait CONVERTER_UNSUPPORTED extends XE
    /* 8 */ val CONVERTER_UNSUPPORTED: typings.xmlCore.errorMod.XE.CONVERTER_UNSUPPORTED with Double = js.native
    
    @js.native
    sealed trait CRYPTOGRAPHIC extends XE
    /* 13 */ val CRYPTOGRAPHIC: typings.xmlCore.errorMod.XE.CRYPTOGRAPHIC with Double = js.native
    
    @js.native
    sealed trait CRYPTOGRAPHIC_NO_MODULE extends XE
    /* 14 */ val CRYPTOGRAPHIC_NO_MODULE: typings.xmlCore.errorMod.XE.CRYPTOGRAPHIC_NO_MODULE with Double = js.native
    
    @js.native
    sealed trait CRYPTOGRAPHIC_UNKNOWN_TRANSFORM extends XE
    /* 15 */ val CRYPTOGRAPHIC_UNKNOWN_TRANSFORM: typings.xmlCore.errorMod.XE.CRYPTOGRAPHIC_UNKNOWN_TRANSFORM with Double = js.native
    
    @js.native
    sealed trait DECORATOR_NULL_PARAM extends XE
    /* 3 */ val DECORATOR_NULL_PARAM: typings.xmlCore.errorMod.XE.DECORATOR_NULL_PARAM with Double = js.native
    
    @js.native
    sealed trait ELEMENT_MALFORMED extends XE
    /* 9 */ val ELEMENT_MALFORMED: typings.xmlCore.errorMod.XE.ELEMENT_MALFORMED with Double = js.native
    
    @js.native
    sealed trait ELEMENT_MISSING extends XE
    /* 10 */ val ELEMENT_MISSING: typings.xmlCore.errorMod.XE.ELEMENT_MISSING with Double = js.native
    
    @js.native
    sealed trait METHOD_NOT_IMPLEMENTED extends XE
    /* 5 */ val METHOD_NOT_IMPLEMENTED: typings.xmlCore.errorMod.XE.METHOD_NOT_IMPLEMENTED with Double = js.native
    
    @js.native
    sealed trait METHOD_NOT_SUPPORTED extends XE
    /* 6 */ val METHOD_NOT_SUPPORTED: typings.xmlCore.errorMod.XE.METHOD_NOT_SUPPORTED with Double = js.native
    
    @js.native
    sealed trait NONE extends XE
    /* 0 */ val NONE: typings.xmlCore.errorMod.XE.NONE with Double = js.native
    
    @js.native
    sealed trait NULL_PARAM extends XE
    /* 2 */ val NULL_PARAM: typings.xmlCore.errorMod.XE.NULL_PARAM with Double = js.native
    
    @js.native
    sealed trait NULL_REFERENCE extends XE
    /* 1 */ val NULL_REFERENCE: typings.xmlCore.errorMod.XE.NULL_REFERENCE with Double = js.native
    
    @js.native
    sealed trait PARAM_REQUIRED extends XE
    /* 7 */ val PARAM_REQUIRED: typings.xmlCore.errorMod.XE.PARAM_REQUIRED with Double = js.native
    
    @js.native
    sealed trait XML_EXCEPTION extends XE
    /* 18 */ val XML_EXCEPTION: typings.xmlCore.errorMod.XE.XML_EXCEPTION with Double = js.native
  }
  
  @JSImport("xml-core/dist/types/error", "XmlError")
  @js.native
  class XmlError protected () extends Error {
    def this(code: XE, args: js.Any*) = this()
    
    var code: Double = js.native
    
    val prefix: /* "XMLJS" */ String = js.native
  }
}
