package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import typings.std.File
import typings.std.HTMLElement
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.directApiMod.DirectOptions
import typings.testingLibraryUserEvent.optionsMod.Options
import typings.testingLibraryUserEvent.pointerMod.PointerInput
import typings.testingLibraryUserEvent.setupSetupMod.UserEvent
import typings.testingLibraryUserEvent.systemMod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupMod {
  
  object userEvent {
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.clear")
    @js.native
    val clear: js.Function1[/* element */ Element, js.Promise[Unit]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.click")
    @js.native
    val click: js.Function2[/* element */ Element, /* options */ js.UndefOr[DirectOptions], js.Promise[Unit]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.copy")
    @js.native
    val copy: js.Function1[/* options */ js.UndefOr[DirectOptions], js.Promise[js.UndefOr[DataTransfer]]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.cut")
    @js.native
    val cut: js.Function1[/* options */ js.UndefOr[DirectOptions], js.Promise[js.UndefOr[DataTransfer]]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.dblClick")
    @js.native
    val dblClick: js.Function2[/* element */ Element, /* options */ js.UndefOr[DirectOptions], js.Promise[Unit]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.deselectOptions")
    @js.native
    val deselectOptions: js.Function3[
        /* select */ Element, 
        /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
        /* options */ js.UndefOr[DirectOptions], 
        js.Promise[Unit]
      ] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.hover")
    @js.native
    val hover: js.Function2[/* element */ Element, /* options */ js.UndefOr[DirectOptions], js.Promise[Unit]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.keyboard")
    @js.native
    val keyboard: js.Function2[/* text */ String, /* options */ js.UndefOr[DirectOptions], js.Promise[System]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.paste")
    @js.native
    val paste: js.Function2[
        /* clipboardData */ js.UndefOr[DataTransfer | String], 
        /* options */ js.UndefOr[DirectOptions], 
        js.Promise[Unit]
      ] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.pointer")
    @js.native
    val pointer: js.Function2[
        /* input */ PointerInput, 
        /* options */ js.UndefOr[DirectOptions], 
        js.Promise[System]
      ] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.selectOptions")
    @js.native
    val selectOptions: js.Function3[
        /* select */ Element, 
        /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
        /* options */ js.UndefOr[DirectOptions], 
        js.Promise[Unit]
      ] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.setup")
    @js.native
    val setup: js.Function1[/* options */ js.UndefOr[Options], UserEvent] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.tab")
    @js.native
    val tab: js.Function1[
        /* options */ js.UndefOr[
          DirectOptions & (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(this : @testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.Instance, hasShift : @testing-library/user-event.anon.Shift | undefined): std.Promise<void>>[0] */ js.Any)
        ], 
        js.Promise[Unit]
      ] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.tripleClick")
    @js.native
    val tripleClick: js.Function2[/* element */ Element, /* options */ js.UndefOr[DirectOptions], js.Promise[Unit]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.type")
    @js.native
    val `type`: js.Function3[
        /* element */ Element, 
        /* text */ String, 
        /* options */ js.UndefOr[
          DirectOptions & (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(this : @testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.Instance, element : @testing-library/user-event.@testing-library/user-event/dist/types/utils/pointer/cssPointerEvents.<global>.Element, text : string, hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd : @testing-library/user-event.@testing-library/user-event/dist/types/utility/type.typeOptions | undefined): std.Promise<void>>[2] */ js.Any)
        ], 
        js.Promise[Unit]
      ] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.unhover")
    @js.native
    val unhover: js.Function2[/* element */ Element, /* options */ js.UndefOr[DirectOptions], js.Promise[Unit]] = js.native
    
    @JSImport("@testing-library/user-event/dist/types/setup", "userEvent.upload")
    @js.native
    val upload: js.Function3[
        /* element */ HTMLElement, 
        /* fileOrFiles */ File | js.Array[File], 
        /* options */ js.UndefOr[DirectOptions], 
        js.Promise[Unit]
      ] = js.native
  }
}
