package typings.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.testingLibraryDom.testingLibraryDomStrings.alttext_
import typings.testingLibraryDom.testingLibraryDomStrings.displayvalue_
import typings.testingLibraryDom.testingLibraryDomStrings.labeltext_
import typings.testingLibraryDom.testingLibraryDomStrings.placeholdertext_
import typings.testingLibraryDom.testingLibraryDomStrings.role_
import typings.testingLibraryDom.testingLibraryDomStrings.testid_
import typings.testingLibraryDom.testingLibraryDomStrings.text_
import typings.testingLibraryDom.testingLibraryDomStrings.title_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSuggestionsMod {
  
  @JSImport("@testing-library/dom/types/suggestions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSuggestedQuery(element: HTMLElement): js.UndefOr[Suggestion] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Unit, method: Method): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  inline def getSuggestedQuery(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedQuery")(element.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Suggestion]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingLibraryDom.testingLibraryDomStrings.AltText
    - typings.testingLibraryDom.testingLibraryDomStrings.alttext_
    - typings.testingLibraryDom.testingLibraryDomStrings.DisplayValue
    - typings.testingLibraryDom.testingLibraryDomStrings.displayvalue_
    - typings.testingLibraryDom.testingLibraryDomStrings.LabelText
    - typings.testingLibraryDom.testingLibraryDomStrings.labeltext_
    - typings.testingLibraryDom.testingLibraryDomStrings.PlaceholderText
    - typings.testingLibraryDom.testingLibraryDomStrings.placeholdertext_
    - typings.testingLibraryDom.testingLibraryDomStrings.Role
    - typings.testingLibraryDom.testingLibraryDomStrings.role_
    - typings.testingLibraryDom.testingLibraryDomStrings.TestId
    - typings.testingLibraryDom.testingLibraryDomStrings.testid_
    - typings.testingLibraryDom.testingLibraryDomStrings.Text
    - typings.testingLibraryDom.testingLibraryDomStrings.text_
    - typings.testingLibraryDom.testingLibraryDomStrings.Title
    - typings.testingLibraryDom.testingLibraryDomStrings.title_
  */
  trait Method extends StObject
  object Method {
    
    inline def AltText: typings.testingLibraryDom.testingLibraryDomStrings.AltText = "AltText".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.AltText]
    
    inline def DisplayValue: typings.testingLibraryDom.testingLibraryDomStrings.DisplayValue = "DisplayValue".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.DisplayValue]
    
    inline def LabelText: typings.testingLibraryDom.testingLibraryDomStrings.LabelText = "LabelText".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.LabelText]
    
    inline def PlaceholderText: typings.testingLibraryDom.testingLibraryDomStrings.PlaceholderText = "PlaceholderText".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.PlaceholderText]
    
    inline def Role: typings.testingLibraryDom.testingLibraryDomStrings.Role = "Role".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.Role]
    
    inline def TestId: typings.testingLibraryDom.testingLibraryDomStrings.TestId = "TestId".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.TestId]
    
    inline def Text: typings.testingLibraryDom.testingLibraryDomStrings.Text = "Text".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.Text]
    
    inline def Title: typings.testingLibraryDom.testingLibraryDomStrings.Title = "Title".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.Title]
    
    inline def alttext: alttext_ = "alttext".asInstanceOf[alttext_]
    
    inline def displayvalue: displayvalue_ = "displayvalue".asInstanceOf[displayvalue_]
    
    inline def labeltext: labeltext_ = "labeltext".asInstanceOf[labeltext_]
    
    inline def placeholdertext: placeholdertext_ = "placeholdertext".asInstanceOf[placeholdertext_]
    
    inline def role: role_ = "role".asInstanceOf[role_]
    
    inline def testid: testid_ = "testid".asInstanceOf[testid_]
    
    inline def text: text_ = "text".asInstanceOf[text_]
    
    inline def title: title_ = "title".asInstanceOf[title_]
  }
  
  type QueryArgs = js.Tuple2[String, js.UndefOr[QueryOptions]]
  
  type QueryOptions = StringDictionary[js.RegExp | Boolean]
  
  trait Suggestion extends StObject {
    
    var queryArgs: QueryArgs
    
    var queryMethod: String
    
    var queryName: String
    
    var variant: String
    
    var warning: js.UndefOr[String] = js.undefined
  }
  object Suggestion {
    
    inline def apply(queryArgs: QueryArgs, queryMethod: String, queryName: String, variant: String): Suggestion = {
      val __obj = js.Dynamic.literal(queryArgs = queryArgs.asInstanceOf[js.Any], queryMethod = queryMethod.asInstanceOf[js.Any], queryName = queryName.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggestion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
      
      inline def setQueryArgs(value: QueryArgs): Self = StObject.set(x, "queryArgs", value.asInstanceOf[js.Any])
      
      inline def setQueryMethod(value: String): Self = StObject.set(x, "queryMethod", value.asInstanceOf[js.Any])
      
      inline def setQueryName(value: String): Self = StObject.set(x, "queryName", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingLibraryDom.testingLibraryDomStrings.find
    - typings.testingLibraryDom.testingLibraryDomStrings.findAll
    - typings.testingLibraryDom.testingLibraryDomStrings.get
    - typings.testingLibraryDom.testingLibraryDomStrings.getAll
    - typings.testingLibraryDom.testingLibraryDomStrings.query
    - typings.testingLibraryDom.testingLibraryDomStrings.queryAll
  */
  trait Variant extends StObject
  object Variant {
    
    inline def find: typings.testingLibraryDom.testingLibraryDomStrings.find = "find".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.find]
    
    inline def findAll: typings.testingLibraryDom.testingLibraryDomStrings.findAll = "findAll".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.findAll]
    
    inline def get: typings.testingLibraryDom.testingLibraryDomStrings.get = "get".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.get]
    
    inline def getAll: typings.testingLibraryDom.testingLibraryDomStrings.getAll = "getAll".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.getAll]
    
    inline def query: typings.testingLibraryDom.testingLibraryDomStrings.query = "query".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.query]
    
    inline def queryAll: typings.testingLibraryDom.testingLibraryDomStrings.queryAll = "queryAll".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.queryAll]
  }
}
