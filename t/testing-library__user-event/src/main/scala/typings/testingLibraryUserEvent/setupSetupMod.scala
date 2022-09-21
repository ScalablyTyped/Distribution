package typings.testingLibraryUserEvent

import typings.std.DataTransfer
import typings.std.Document
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import typings.std.OmitThisParameter
import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import typings.testingLibraryUserEvent.anon.Api
import typings.testingLibraryUserEvent.anon.DirectOptionskeyboardStat
import typings.testingLibraryUserEvent.anon.FnCall
import typings.testingLibraryUserEvent.anon.RequiredOptions
import typings.testingLibraryUserEvent.anon.Shift
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.optionsMod.Options
import typings.testingLibraryUserEvent.optionsMod.PointerEventsCheckLevel
import typings.testingLibraryUserEvent.pointerMod.PointerInput
import typings.testingLibraryUserEvent.prepareDocumentMod.global.Node
import typings.testingLibraryUserEvent.sharedMod.pointerKey
import typings.testingLibraryUserEvent.systemKeyboardMod.keyboardKey
import typings.testingLibraryUserEvent.systemMod.System
import typings.testingLibraryUserEvent.typeMod.typeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupSetupMod {
  
  @JSImport("@testing-library/user-event/dist/types/setup/setup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")().asInstanceOf[Config]
  inline def createConfig(options: Unit, defaults: Unit, node: Node): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Config]
  inline def createConfig(options: Unit, defaults: RequiredOptions): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Config]
  inline def createConfig(options: Unit, defaults: RequiredOptions, node: Node): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Config]
  inline def createConfig(options: Options): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Config]
  inline def createConfig(options: Options, defaults: Unit, node: Node): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Config]
  inline def createConfig(options: Options, defaults: RequiredOptions): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Config]
  inline def createConfig(options: Options, defaults: RequiredOptions, node: Node): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Config]
  
  inline def createInstance(config: Config): typings.testingLibraryUserEvent.anon.Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(config.asInstanceOf[js.Any]).asInstanceOf[typings.testingLibraryUserEvent.anon.Instance]
  inline def createInstance(config: Config, system: System): typings.testingLibraryUserEvent.anon.Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(config.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[typings.testingLibraryUserEvent.anon.Instance]
  
  inline def setupDirect(): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("setupDirect")().asInstanceOf[Api]
  inline def setupDirect(hasKeyboardStatePointerStateOptions: Unit, // backward-compatibility
  node: Node): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("setupDirect")(hasKeyboardStatePointerStateOptions.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Api]
  inline def setupDirect(hasKeyboardStatePointerStateOptions: DirectOptionskeyboardStat): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("setupDirect")(hasKeyboardStatePointerStateOptions.asInstanceOf[js.Any]).asInstanceOf[Api]
  inline def setupDirect(
    hasKeyboardStatePointerStateOptions: DirectOptionskeyboardStat,
    // backward-compatibility
  node: Node
  ): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("setupDirect")(hasKeyboardStatePointerStateOptions.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Api]
  
  inline def setupMain(): UserEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("setupMain")().asInstanceOf[UserEvent]
  inline def setupMain(options: Options): UserEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("setupMain")(options.asInstanceOf[js.Any]).asInstanceOf[UserEvent]
  
  inline def setupSub(options: Options): UserEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("setupSub")(options.asInstanceOf[js.Any]).asInstanceOf[UserEvent]
  
  /* Inlined std.Required<@testing-library/user-event.@testing-library/user-event/dist/types/options.Options> */
  trait Config extends StObject {
    
    var advanceTimers: js.Function1[/* delay */ Double, js.Promise[Unit] | Unit]
    
    var applyAccept: Boolean
    
    var autoModify: Boolean
    
    var delay: Double
    
    var document: Document
    
    var keyboardMap: js.Array[keyboardKey]
    
    var pointerEventsCheck: PointerEventsCheckLevel | Double
    
    var pointerMap: js.Array[pointerKey]
    
    var skipAutoClose: Boolean
    
    var skipClick: Boolean
    
    var skipHover: Boolean
    
    var writeToClipboard: Boolean
  }
  object Config {
    
    inline def apply(
      advanceTimers: /* delay */ Double => js.Promise[Unit] | Unit,
      applyAccept: Boolean,
      autoModify: Boolean,
      delay: Double,
      document: Document,
      keyboardMap: js.Array[keyboardKey],
      pointerEventsCheck: PointerEventsCheckLevel | Double,
      pointerMap: js.Array[pointerKey],
      skipAutoClose: Boolean,
      skipClick: Boolean,
      skipHover: Boolean,
      writeToClipboard: Boolean
    ): Config = {
      val __obj = js.Dynamic.literal(advanceTimers = js.Any.fromFunction1(advanceTimers), applyAccept = applyAccept.asInstanceOf[js.Any], autoModify = autoModify.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], keyboardMap = keyboardMap.asInstanceOf[js.Any], pointerEventsCheck = pointerEventsCheck.asInstanceOf[js.Any], pointerMap = pointerMap.asInstanceOf[js.Any], skipAutoClose = skipAutoClose.asInstanceOf[js.Any], skipClick = skipClick.asInstanceOf[js.Any], skipHover = skipHover.asInstanceOf[js.Any], writeToClipboard = writeToClipboard.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAdvanceTimers(value: /* delay */ Double => js.Promise[Unit] | Unit): Self = StObject.set(x, "advanceTimers", js.Any.fromFunction1(value))
      
      inline def setApplyAccept(value: Boolean): Self = StObject.set(x, "applyAccept", value.asInstanceOf[js.Any])
      
      inline def setAutoModify(value: Boolean): Self = StObject.set(x, "autoModify", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setKeyboardMap(value: js.Array[keyboardKey]): Self = StObject.set(x, "keyboardMap", value.asInstanceOf[js.Any])
      
      inline def setKeyboardMapVarargs(value: keyboardKey*): Self = StObject.set(x, "keyboardMap", js.Array(value*))
      
      inline def setPointerEventsCheck(value: PointerEventsCheckLevel | Double): Self = StObject.set(x, "pointerEventsCheck", value.asInstanceOf[js.Any])
      
      inline def setPointerMap(value: js.Array[pointerKey]): Self = StObject.set(x, "pointerMap", value.asInstanceOf[js.Any])
      
      inline def setPointerMapVarargs(value: pointerKey*): Self = StObject.set(x, "pointerMap", js.Array(value*))
      
      inline def setSkipAutoClose(value: Boolean): Self = StObject.set(x, "skipAutoClose", value.asInstanceOf[js.Any])
      
      inline def setSkipClick(value: Boolean): Self = StObject.set(x, "skipClick", value.asInstanceOf[js.Any])
      
      inline def setSkipHover(value: Boolean): Self = StObject.set(x, "skipHover", value.asInstanceOf[js.Any])
      
      inline def setWriteToClipboard(value: Boolean): Self = StObject.set(x, "writeToClipboard", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance
    extends StObject
       with UserEventApi {
    
    var config: Config = js.native
    
    var dispatchEvent: OmitThisParameter[
        js.ThisFunction3[
          /* this */ this.type, 
          /* target */ Element, 
          /* event */ Event, 
          /* preventDefault */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.native
    
    var dispatchUIEvent: OmitThisParameter[FnCall] = js.native
    
    var levelRefs: Record[Double, js.UndefOr[js.Object]] = js.native
    
    var system: System = js.native
  }
  
  /* Inlined {readonly setup (args : std.Parameters<(this : @testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.Instance, options : @testing-library/user-event.@testing-library/user-event/dist/types/options.Options): @testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.UserEvent>): @testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.UserEvent} & {readonly [ k in keyof @testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.UserEventApi ]: (args : std.Parameters<@testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.UserEventApi[k]>): std.ReturnType<@testing-library/user-event.@testing-library/user-event/dist/types/setup/setup.UserEventApi[k]>} */
  trait UserEvent extends StObject {
    
    val clear: js.Function1[
        /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]], 
        ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ]
    
    val click: js.Function1[
        /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]], 
        ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ]
    
    val copy: js.Function1[
        /* args */ Parameters[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]], 
        ReturnType[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]]
      ]
    
    val cut: js.Function1[
        /* args */ Parameters[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]], 
        ReturnType[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]]
      ]
    
    val dblClick: js.Function1[
        /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]], 
        ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ]
    
    val deselectOptions: js.Function1[
        /* args */ Parameters[
          js.ThisFunction2[
            /* this */ Instance, 
            /* select */ Element, 
            /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
            js.Promise[Unit]
          ]
        ], 
        ReturnType[
          js.ThisFunction2[
            /* this */ Instance, 
            /* select */ Element, 
            /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
            js.Promise[Unit]
          ]
        ]
      ]
    
    val hover: js.Function1[
        /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]], 
        ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ]
    
    val keyboard: js.Function1[
        /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* text */ String, js.Promise[Unit]]], 
        ReturnType[js.ThisFunction1[/* this */ Instance, /* text */ String, js.Promise[Unit]]]
      ]
    
    val paste: js.Function1[
        /* args */ Parameters[
          js.ThisFunction1[
            /* this */ Instance, 
            /* clipboardData */ js.UndefOr[DataTransfer | String], 
            js.Promise[Unit]
          ]
        ], 
        ReturnType[
          js.ThisFunction1[
            /* this */ Instance, 
            /* clipboardData */ js.UndefOr[DataTransfer | String], 
            js.Promise[Unit]
          ]
        ]
      ]
    
    val pointer: js.Function1[
        /* args */ Parameters[
          js.ThisFunction1[/* this */ Instance, /* input */ PointerInput, js.Promise[Unit]]
        ], 
        ReturnType[
          js.ThisFunction1[/* this */ Instance, /* input */ PointerInput, js.Promise[Unit]]
        ]
      ]
    
    val selectOptions: js.Function1[
        /* args */ Parameters[
          js.ThisFunction2[
            /* this */ Instance, 
            /* select */ Element, 
            /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
            js.Promise[Unit]
          ]
        ], 
        ReturnType[
          js.ThisFunction2[
            /* this */ Instance, 
            /* select */ Element, 
            /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
            js.Promise[Unit]
          ]
        ]
      ]
    
    def setup(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof setupSub> is not an array type */ args: Parameters[js.ThisFunction1[/* this */ Instance, /* options */ Options, this.type]]
    ): UserEvent
    
    val tab: js.Function1[
        /* args */ Parameters[
          js.ThisFunction1[/* this */ Instance, /* hasShift */ js.UndefOr[Shift], js.Promise[Unit]]
        ], 
        ReturnType[
          js.ThisFunction1[/* this */ Instance, /* hasShift */ js.UndefOr[Shift], js.Promise[Unit]]
        ]
      ]
    
    val tripleClick: js.Function1[
        /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]], 
        ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ]
    
    val `type`: js.Function1[
        /* args */ Parameters[
          js.ThisFunction3[
            /* this */ Instance, 
            /* element */ Element, 
            /* text */ String, 
            /* hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd */ js.UndefOr[typeOptions], 
            js.Promise[Unit]
          ]
        ], 
        ReturnType[
          js.ThisFunction3[
            /* this */ Instance, 
            /* element */ Element, 
            /* text */ String, 
            /* hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd */ js.UndefOr[typeOptions], 
            js.Promise[Unit]
          ]
        ]
      ]
    
    val unhover: js.Function1[
        /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]], 
        ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ]
    
    val upload: js.Function1[
        /* args */ Parameters[
          js.ThisFunction2[
            /* this */ Instance, 
            /* element */ HTMLElement, 
            /* fileOrFiles */ File | js.Array[File], 
            js.Promise[Unit]
          ]
        ], 
        ReturnType[
          js.ThisFunction2[
            /* this */ Instance, 
            /* element */ HTMLElement, 
            /* fileOrFiles */ File | js.Array[File], 
            js.Promise[Unit]
          ]
        ]
      ]
  }
  object UserEvent {
    
    inline def apply(
      clear: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]],
      click: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]],
      copy: /* args */ Parameters[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]] => ReturnType[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]],
      cut: /* args */ Parameters[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]] => ReturnType[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]],
      dblClick: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]],
      deselectOptions: /* args */ Parameters[
          js.ThisFunction2[
            /* this */ Instance, 
            /* select */ Element, 
            /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
            js.Promise[Unit]
          ]
        ] => ReturnType[
          js.ThisFunction2[
            /* this */ Instance, 
            /* select */ Element, 
            /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
            js.Promise[Unit]
          ]
        ],
      hover: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]],
      keyboard: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* text */ String, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* text */ String, js.Promise[Unit]]],
      paste: /* args */ Parameters[
          js.ThisFunction1[
            /* this */ Instance, 
            /* clipboardData */ js.UndefOr[DataTransfer | String], 
            js.Promise[Unit]
          ]
        ] => ReturnType[
          js.ThisFunction1[
            /* this */ Instance, 
            /* clipboardData */ js.UndefOr[DataTransfer | String], 
            js.Promise[Unit]
          ]
        ],
      pointer: /* args */ Parameters[
          js.ThisFunction1[/* this */ Instance, /* input */ PointerInput, js.Promise[Unit]]
        ] => ReturnType[
          js.ThisFunction1[/* this */ Instance, /* input */ PointerInput, js.Promise[Unit]]
        ],
      selectOptions: /* args */ Parameters[
          js.ThisFunction2[
            /* this */ Instance, 
            /* select */ Element, 
            /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
            js.Promise[Unit]
          ]
        ] => ReturnType[
          js.ThisFunction2[
            /* this */ Instance, 
            /* select */ Element, 
            /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
            js.Promise[Unit]
          ]
        ],
      setup: Parameters[js.ThisFunction1[/* this */ Instance, /* options */ Options, UserEvent]] => UserEvent,
      tab: /* args */ Parameters[
          js.ThisFunction1[/* this */ Instance, /* hasShift */ js.UndefOr[Shift], js.Promise[Unit]]
        ] => ReturnType[
          js.ThisFunction1[/* this */ Instance, /* hasShift */ js.UndefOr[Shift], js.Promise[Unit]]
        ],
      tripleClick: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]],
      `type`: /* args */ Parameters[
          js.ThisFunction3[
            /* this */ Instance, 
            /* element */ Element, 
            /* text */ String, 
            /* hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd */ js.UndefOr[typeOptions], 
            js.Promise[Unit]
          ]
        ] => ReturnType[
          js.ThisFunction3[
            /* this */ Instance, 
            /* element */ Element, 
            /* text */ String, 
            /* hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd */ js.UndefOr[typeOptions], 
            js.Promise[Unit]
          ]
        ],
      unhover: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]],
      upload: /* args */ Parameters[
          js.ThisFunction2[
            /* this */ Instance, 
            /* element */ HTMLElement, 
            /* fileOrFiles */ File | js.Array[File], 
            js.Promise[Unit]
          ]
        ] => ReturnType[
          js.ThisFunction2[
            /* this */ Instance, 
            /* element */ HTMLElement, 
            /* fileOrFiles */ File | js.Array[File], 
            js.Promise[Unit]
          ]
        ]
    ): UserEvent = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), click = js.Any.fromFunction1(click), copy = js.Any.fromFunction1(copy), cut = js.Any.fromFunction1(cut), dblClick = js.Any.fromFunction1(dblClick), deselectOptions = js.Any.fromFunction1(deselectOptions), hover = js.Any.fromFunction1(hover), keyboard = js.Any.fromFunction1(keyboard), paste = js.Any.fromFunction1(paste), pointer = js.Any.fromFunction1(pointer), selectOptions = js.Any.fromFunction1(selectOptions), setup = js.Any.fromFunction1(setup), tab = js.Any.fromFunction1(tab), tripleClick = js.Any.fromFunction1(tripleClick), unhover = js.Any.fromFunction1(unhover), upload = js.Any.fromFunction1(upload))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[UserEvent]
    }
    
    extension [Self <: UserEvent](x: Self) {
      
      inline def setClear(
        value: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setClick(
        value: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setCopy(
        value: /* args */ Parameters[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]] => ReturnType[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]]
      ): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setCut(
        value: /* args */ Parameters[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]] => ReturnType[js.ThisFunction0[/* this */ Instance, js.Promise[js.UndefOr[DataTransfer]]]]
      ): Self = StObject.set(x, "cut", js.Any.fromFunction1(value))
      
      inline def setDblClick(
        value: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction1(value))
      
      inline def setDeselectOptions(
        value: /* args */ Parameters[
              js.ThisFunction2[
                /* this */ Instance, 
                /* select */ Element, 
                /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
                js.Promise[Unit]
              ]
            ] => ReturnType[
              js.ThisFunction2[
                /* this */ Instance, 
                /* select */ Element, 
                /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
                js.Promise[Unit]
              ]
            ]
      ): Self = StObject.set(x, "deselectOptions", js.Any.fromFunction1(value))
      
      inline def setHover(
        value: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ): Self = StObject.set(x, "hover", js.Any.fromFunction1(value))
      
      inline def setKeyboard(
        value: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* text */ String, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* text */ String, js.Promise[Unit]]]
      ): Self = StObject.set(x, "keyboard", js.Any.fromFunction1(value))
      
      inline def setPaste(
        value: /* args */ Parameters[
              js.ThisFunction1[
                /* this */ Instance, 
                /* clipboardData */ js.UndefOr[DataTransfer | String], 
                js.Promise[Unit]
              ]
            ] => ReturnType[
              js.ThisFunction1[
                /* this */ Instance, 
                /* clipboardData */ js.UndefOr[DataTransfer | String], 
                js.Promise[Unit]
              ]
            ]
      ): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      inline def setPointer(
        value: /* args */ Parameters[
              js.ThisFunction1[/* this */ Instance, /* input */ PointerInput, js.Promise[Unit]]
            ] => ReturnType[
              js.ThisFunction1[/* this */ Instance, /* input */ PointerInput, js.Promise[Unit]]
            ]
      ): Self = StObject.set(x, "pointer", js.Any.fromFunction1(value))
      
      inline def setSelectOptions(
        value: /* args */ Parameters[
              js.ThisFunction2[
                /* this */ Instance, 
                /* select */ Element, 
                /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
                js.Promise[Unit]
              ]
            ] => ReturnType[
              js.ThisFunction2[
                /* this */ Instance, 
                /* select */ Element, 
                /* values */ HTMLElement | (js.Array[HTMLElement | String]) | String, 
                js.Promise[Unit]
              ]
            ]
      ): Self = StObject.set(x, "selectOptions", js.Any.fromFunction1(value))
      
      inline def setSetup(
        value: Parameters[js.ThisFunction1[/* this */ Instance, /* options */ Options, UserEvent]] => UserEvent
      ): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      inline def setTab(
        value: /* args */ Parameters[
              js.ThisFunction1[/* this */ Instance, /* hasShift */ js.UndefOr[Shift], js.Promise[Unit]]
            ] => ReturnType[
              js.ThisFunction1[/* this */ Instance, /* hasShift */ js.UndefOr[Shift], js.Promise[Unit]]
            ]
      ): Self = StObject.set(x, "tab", js.Any.fromFunction1(value))
      
      inline def setTripleClick(
        value: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ): Self = StObject.set(x, "tripleClick", js.Any.fromFunction1(value))
      
      inline def setType(
        value: /* args */ Parameters[
              js.ThisFunction3[
                /* this */ Instance, 
                /* element */ Element, 
                /* text */ String, 
                /* hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd */ js.UndefOr[typeOptions], 
                js.Promise[Unit]
              ]
            ] => ReturnType[
              js.ThisFunction3[
                /* this */ Instance, 
                /* element */ Element, 
                /* text */ String, 
                /* hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd */ js.UndefOr[typeOptions], 
                js.Promise[Unit]
              ]
            ]
      ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setUnhover(
        value: /* args */ Parameters[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]] => ReturnType[js.ThisFunction1[/* this */ Instance, /* element */ Element, js.Promise[Unit]]]
      ): Self = StObject.set(x, "unhover", js.Any.fromFunction1(value))
      
      inline def setUpload(
        value: /* args */ Parameters[
              js.ThisFunction2[
                /* this */ Instance, 
                /* element */ HTMLElement, 
                /* fileOrFiles */ File | js.Array[File], 
                js.Promise[Unit]
              ]
            ] => ReturnType[
              js.ThisFunction2[
                /* this */ Instance, 
                /* element */ HTMLElement, 
                /* fileOrFiles */ File | js.Array[File], 
                js.Promise[Unit]
              ]
            ]
      ): Self = StObject.set(x, "upload", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UserEventApi extends StObject {
    
    def clear(element: Element): js.Promise[Unit] = js.native
    
    def click(element: Element): js.Promise[Unit] = js.native
    
    def copy(): js.Promise[js.UndefOr[DataTransfer]] = js.native
    
    def cut(): js.Promise[js.UndefOr[DataTransfer]] = js.native
    
    def dblClick(element: Element): js.Promise[Unit] = js.native
    
    def deselectOptions(select: Element, values: String): js.Promise[Unit] = js.native
    def deselectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = js.native
    def deselectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = js.native
    
    def hover(element: Element): js.Promise[Unit] = js.native
    
    def keyboard(text: String): js.Promise[Unit] = js.native
    
    def paste(): js.Promise[Unit] = js.native
    def paste(clipboardData: String): js.Promise[Unit] = js.native
    def paste(clipboardData: DataTransfer): js.Promise[Unit] = js.native
    
    def pointer(input: PointerInput): js.Promise[Unit] = js.native
    
    def selectOptions(select: Element, values: String): js.Promise[Unit] = js.native
    def selectOptions(select: Element, values: js.Array[HTMLElement | String]): js.Promise[Unit] = js.native
    def selectOptions(select: Element, values: HTMLElement): js.Promise[Unit] = js.native
    
    def tab(): js.Promise[Unit] = js.native
    def tab(hasShift: Shift): js.Promise[Unit] = js.native
    
    def tripleClick(element: Element): js.Promise[Unit] = js.native
    
    def `type`(element: Element, text: String): js.Promise[Unit] = js.native
    def `type`(
      element: Element,
      text: String,
      hasSkipClickSkipAutoCloseInitialSelectionStartInitialSelectionEnd: typeOptions
    ): js.Promise[Unit] = js.native
    
    def unhover(element: Element): js.Promise[Unit] = js.native
    
    def upload(element: HTMLElement, fileOrFiles: js.Array[File]): js.Promise[Unit] = js.native
    def upload(element: HTMLElement, fileOrFiles: File): js.Promise[Unit] = js.native
  }
}
