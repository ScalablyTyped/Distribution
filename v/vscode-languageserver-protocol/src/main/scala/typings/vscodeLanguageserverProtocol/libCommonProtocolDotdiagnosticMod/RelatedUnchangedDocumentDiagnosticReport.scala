package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedUnchangedDocumentDiagnosticReport
  extends StObject
     with UnchangedDocumentDiagnosticReport
     with DocumentDiagnosticReport {
  
  /**
    * Diagnostics of related documents. This information is useful
    * in programming languages where code in a file A can generate
    * diagnostics in a file B which A depends on. An example of
    * such a language is C/C++ where marco definitions in a file
    * a.cpp and result in errors in a header file b.hpp.
    *
    * @since 3.17.0
    */
  var relatedDocuments: js.UndefOr[
    StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]
  ] = js.undefined
}
object RelatedUnchangedDocumentDiagnosticReport {
  
  inline def apply(kind: /* "unchanged" */ String, resultId: String): RelatedUnchangedDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedUnchangedDocumentDiagnosticReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedUnchangedDocumentDiagnosticReport] (val x: Self) extends AnyVal {
    
    inline def setRelatedDocuments(value: StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]): Self = StObject.set(x, "relatedDocuments", value.asInstanceOf[js.Any])
    
    inline def setRelatedDocumentsUndefined: Self = StObject.set(x, "relatedDocuments", js.undefined)
  }
}
