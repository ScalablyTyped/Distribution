package typings.whoops

import typings.std.Record
import typings.whoops.whoopsStrings.EvalError
import typings.whoops.whoopsStrings.RangeError
import typings.whoops.whoopsStrings.ReferenceError
import typings.whoops.whoopsStrings.SyntaxError
import typings.whoops.whoopsStrings.TypeError
import typings.whoops.whoopsStrings.URIError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtendError[js.Error, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtendError[js.Error, Any]]
  inline def apply(className: String): ExtendError[js.Error, Any] = ^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.Error, Any]]
  inline def apply(className: String, props: Record[String, Any]): ExtendError[js.Error, Any] = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.Error, Any]]
  inline def apply(className: Unit, props: Record[String, Any]): ExtendError[js.Error, Any] = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.Error, Any]]
  inline def apply(className: EvalError): ExtendError[js.EvalError, Any] = ^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.EvalError, Any]]
  inline def apply(className: EvalError, props: Record[String, Any]): ExtendError[js.EvalError, Any] = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.EvalError, Any]]
  inline def apply(className: RangeError): ExtendError[js.RangeError, Any] = ^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.RangeError, Any]]
  inline def apply(className: RangeError, props: Record[String, Any]): ExtendError[js.RangeError, Any] = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.RangeError, Any]]
  inline def apply(className: ReferenceError): ExtendError[js.ReferenceError, Any] = ^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.ReferenceError, Any]]
  inline def apply(className: ReferenceError, props: Record[String, Any]): ExtendError[js.ReferenceError, Any] = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.ReferenceError, Any]]
  inline def apply(className: SyntaxError): ExtendError[js.SyntaxError, Any] = ^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.SyntaxError, Any]]
  inline def apply(className: SyntaxError, props: Record[String, Any]): ExtendError[js.SyntaxError, Any] = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.SyntaxError, Any]]
  inline def apply(className: TypeError): ExtendError[js.TypeError, Any] = ^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.TypeError, Any]]
  inline def apply(className: TypeError, props: Record[String, Any]): ExtendError[js.TypeError, Any] = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.TypeError, Any]]
  inline def apply(className: URIError): ExtendError[js.URIError, Any] = ^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.URIError, Any]]
  inline def apply(className: URIError, props: Record[String, Any]): ExtendError[js.URIError, Any] = (^.asInstanceOf[js.Dynamic].apply(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.URIError, Any]]
  
  @JSImport("whoops", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(): ExtendError[js.RangeError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")().asInstanceOf[ExtendError[js.RangeError, Any]]
  inline def range(className: String): ExtendError[js.RangeError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.RangeError, Any]]
  inline def range(className: String, props: Record[String, Any]): ExtendError[js.RangeError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.RangeError, Any]]
  inline def range(className: Unit, props: Record[String, Any]): ExtendError[js.RangeError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.RangeError, Any]]
  
  inline def reference(): ExtendError[js.ReferenceError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reference")().asInstanceOf[ExtendError[js.ReferenceError, Any]]
  inline def reference(className: String): ExtendError[js.ReferenceError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reference")(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.ReferenceError, Any]]
  inline def reference(className: String, props: Record[String, Any]): ExtendError[js.ReferenceError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("reference")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.ReferenceError, Any]]
  inline def reference(className: Unit, props: Record[String, Any]): ExtendError[js.ReferenceError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("reference")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.ReferenceError, Any]]
  
  // function eval(className?: string, props?: Record<string, any>): ExtendError<EvalError>;
  inline def syntax(): ExtendError[js.SyntaxError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("syntax")().asInstanceOf[ExtendError[js.SyntaxError, Any]]
  inline def syntax(className: String): ExtendError[js.SyntaxError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("syntax")(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.SyntaxError, Any]]
  inline def syntax(className: String, props: Record[String, Any]): ExtendError[js.SyntaxError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("syntax")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.SyntaxError, Any]]
  inline def syntax(className: Unit, props: Record[String, Any]): ExtendError[js.SyntaxError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("syntax")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.SyntaxError, Any]]
  
  inline def `type`(): ExtendError[js.TypeError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")().asInstanceOf[ExtendError[js.TypeError, Any]]
  inline def `type`(className: String): ExtendError[js.TypeError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.TypeError, Any]]
  inline def `type`(className: String, props: Record[String, Any]): ExtendError[js.TypeError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.TypeError, Any]]
  inline def `type`(className: Unit, props: Record[String, Any]): ExtendError[js.TypeError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.TypeError, Any]]
  
  inline def uri(): ExtendError[js.URIError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uri")().asInstanceOf[ExtendError[js.URIError, Any]]
  inline def uri(className: String): ExtendError[js.URIError, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("uri")(className.asInstanceOf[js.Any]).asInstanceOf[ExtendError[js.URIError, Any]]
  inline def uri(className: String, props: Record[String, Any]): ExtendError[js.URIError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uri")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.URIError, Any]]
  inline def uri(className: Unit, props: Record[String, Any]): ExtendError[js.URIError, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("uri")(className.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ExtendError[js.URIError, Any]]
  
  type ExtendError[E /* <: js.Error */, P /* <: Record[String, Any] */] = js.Function1[/* propsOrMessage */ js.UndefOr[P | String], E & P]
}
