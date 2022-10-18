package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeLanguageserverTypes.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedFullDocumentDiagnosticReport
  extends StObject
     with FullDocumentDiagnosticReport
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
object RelatedFullDocumentDiagnosticReport {
  
  inline def apply(items: js.Array[Diagnostic], kind: /* "full" */ String): RelatedFullDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedFullDocumentDiagnosticReport]
  }
  
  extension [Self <: RelatedFullDocumentDiagnosticReport](x: Self) {
    
    inline def setRelatedDocuments(value: StringDictionary[FullDocumentDiagnosticReport | UnchangedDocumentDiagnosticReport]): Self = StObject.set(x, "relatedDocuments", value.asInstanceOf[js.Any])
    
    inline def setRelatedDocumentsUndefined: Self = StObject.set(x, "relatedDocuments", js.undefined)
  }
}
