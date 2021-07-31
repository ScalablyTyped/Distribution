package typings.testingLibraryDom

import typings.prettyFormat.mod.OptionsReceived
import typings.std.Element
import typings.std.HTMLDocument
import typings.testingLibraryDom.anon.Debug
import typings.testingLibraryDom.getQueriesForElementMod.BoundFunction
import typings.testingLibraryDom.getQueriesForElementMod.BoundFunctions
import typings.testingLibraryDom.getQueriesForElementMod.Queries
import typings.testingLibraryDom.queriesMod.AllByBoundAttribute
import typings.testingLibraryDom.queriesMod.AllByRole
import typings.testingLibraryDom.queriesMod.AllByText
import typings.testingLibraryDom.queriesMod.FindAllByBoundAttribute
import typings.testingLibraryDom.queriesMod.FindAllByRole_
import typings.testingLibraryDom.queriesMod.FindAllByText_
import typings.testingLibraryDom.queriesMod.FindByBoundAttribute
import typings.testingLibraryDom.queriesMod.FindByRole_
import typings.testingLibraryDom.queriesMod.FindByText_
import typings.testingLibraryDom.queriesMod.GetByBoundAttribute
import typings.testingLibraryDom.queriesMod.GetByRole_
import typings.testingLibraryDom.queriesMod.GetByText_
import typings.testingLibraryDom.queriesMod.QueryByBoundAttribute
import typings.testingLibraryDom.queriesMod.QueryByRole_
import typings.testingLibraryDom.queriesMod.QueryByText_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenMod {
  
  /* Inlined @testing-library/dom.@testing-library/dom/types/screen.Screen<{ readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute}> */
  object screen {
    
    @JSImport("@testing-library/dom/types/screen", "screen")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenience function for `pretty-dom` which also allows an array
      * of elements
      */
    @scala.inline
    def debug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Unit]
    @scala.inline
    def debug(element: js.Array[Element | HTMLDocument]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Unit, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Unit, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Unit, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Element, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: Element, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def debug(element: HTMLDocument, maxLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def debug(element: HTMLDocument, maxLength: Unit, options: OptionsReceived): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@testing-library/dom/types/screen", "screen.findAllByAltText")
    @js.native
    def findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByAltText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findAllByDisplayValue")
    @js.native
    def findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByDisplayValue_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findAllByLabelText")
    @js.native
    def findAllByLabelText: BoundFunction[FindAllByText_] = js.native
    @scala.inline
    def findAllByLabelText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findAllByPlaceholderText")
    @js.native
    def findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByPlaceholderText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findAllByRole")
    @js.native
    def findAllByRole: BoundFunction[FindAllByRole_] = js.native
    @scala.inline
    def findAllByRole_=(x: BoundFunction[FindAllByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findAllByTestId")
    @js.native
    def findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByTestId_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findAllByText")
    @js.native
    def findAllByText: BoundFunction[FindAllByText_] = js.native
    @scala.inline
    def findAllByText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findAllByTitle")
    @js.native
    def findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByTitle_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findByAltText")
    @js.native
    def findByAltText: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByAltText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findByDisplayValue")
    @js.native
    def findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByDisplayValue_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findByLabelText")
    @js.native
    def findByLabelText: BoundFunction[FindByText_] = js.native
    @scala.inline
    def findByLabelText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findByPlaceholderText")
    @js.native
    def findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByPlaceholderText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findByRole")
    @js.native
    def findByRole: BoundFunction[FindByRole_] = js.native
    @scala.inline
    def findByRole_=(x: BoundFunction[FindByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findByTestId")
    @js.native
    def findByTestId: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByTestId_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findByText")
    @js.native
    def findByText: BoundFunction[FindByText_] = js.native
    @scala.inline
    def findByText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.findByTitle")
    @js.native
    def findByTitle: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByTitle_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getAllByAltText")
    @js.native
    def getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getAllByDisplayValue")
    @js.native
    def getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getAllByLabelText")
    @js.native
    def getAllByLabelText: BoundFunction[AllByText] = js.native
    @scala.inline
    def getAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getAllByPlaceholderText")
    @js.native
    def getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getAllByRole")
    @js.native
    def getAllByRole: BoundFunction[AllByRole] = js.native
    @scala.inline
    def getAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getAllByTestId")
    @js.native
    def getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getAllByText")
    @js.native
    def getAllByText: BoundFunction[AllByText] = js.native
    @scala.inline
    def getAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getAllByTitle")
    @js.native
    def getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getByAltText")
    @js.native
    def getByAltText: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByAltText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getByDisplayValue")
    @js.native
    def getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByDisplayValue_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getByLabelText")
    @js.native
    def getByLabelText: BoundFunction[GetByText_] = js.native
    @scala.inline
    def getByLabelText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getByPlaceholderText")
    @js.native
    def getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByPlaceholderText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getByRole")
    @js.native
    def getByRole: BoundFunction[GetByRole_] = js.native
    @scala.inline
    def getByRole_=(x: BoundFunction[GetByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getByTestId")
    @js.native
    def getByTestId: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByTestId_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getByText")
    @js.native
    def getByText: BoundFunction[GetByText_] = js.native
    @scala.inline
    def getByText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.getByTitle")
    @js.native
    def getByTitle: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByTitle_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTitle")(x.asInstanceOf[js.Any])
    
    /**
      * Convenience function for `Testing Playground` which logs URL that
      * can be opened in a browser
      */
    @scala.inline
    def logTestingPlaygroundURL(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")().asInstanceOf[Unit]
    @scala.inline
    def logTestingPlaygroundURL(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def logTestingPlaygroundURL(element: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logTestingPlaygroundURL")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryAllByAltText")
    @js.native
    def queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryAllByDisplayValue")
    @js.native
    def queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryAllByLabelText")
    @js.native
    def queryAllByLabelText: BoundFunction[AllByText] = js.native
    @scala.inline
    def queryAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryAllByPlaceholderText")
    @js.native
    def queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryAllByRole")
    @js.native
    def queryAllByRole: BoundFunction[AllByRole] = js.native
    @scala.inline
    def queryAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryAllByTestId")
    @js.native
    def queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryAllByText")
    @js.native
    def queryAllByText: BoundFunction[AllByText] = js.native
    @scala.inline
    def queryAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryAllByTitle")
    @js.native
    def queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryByAltText")
    @js.native
    def queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByAltText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryByDisplayValue")
    @js.native
    def queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByDisplayValue_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryByLabelText")
    @js.native
    def queryByLabelText: BoundFunction[QueryByText_] = js.native
    @scala.inline
    def queryByLabelText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryByPlaceholderText")
    @js.native
    def queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByPlaceholderText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryByRole")
    @js.native
    def queryByRole: BoundFunction[QueryByRole_] = js.native
    @scala.inline
    def queryByRole_=(x: BoundFunction[QueryByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryByTestId")
    @js.native
    def queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByTestId_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryByText")
    @js.native
    def queryByText: BoundFunction[QueryByText_] = js.native
    @scala.inline
    def queryByText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/dom/types/screen", "screen.queryByTitle")
    @js.native
    def queryByTitle: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByTitle_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTitle")(x.asInstanceOf[js.Any])
  }
  
  type Screen_[Q /* <: Queries */] = BoundFunctions[Q] & Debug
}
