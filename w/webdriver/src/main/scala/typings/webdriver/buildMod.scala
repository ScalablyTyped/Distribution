package typings.webdriver

import typings.std.PropertyDescriptor
import typings.std.Record
import typings.webdriver.anon.PartialSessionFlags
import typings.webdriver.typesMod.AttachOptions
import typings.webdriver.typesMod.Client
import typings.webdriver.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("webdriver/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver/build", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with typings.webdriver.buildMod.WebDriver
  /* static members */
  object default {
    
    @JSImport("webdriver/build", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachToSession(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")().asInstanceOf[Client]
    @scala.inline
    def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(options: Unit, modifier: Unit, userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: Unit,
      modifier: Unit,
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: Unit,
      modifier: Unit,
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(options: AttachOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
    @scala.inline
    def attachToSession(options: AttachOptions, modifier: js.Function1[/* repeated */ js.Any, js.Any]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(options: AttachOptions, modifier: Unit, userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    @scala.inline
    def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    
    @scala.inline
    def newSession(): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")().asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Unit, modifier: Unit, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Unit,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Unit,
      modifier: Unit,
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Options): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(options: Options, modifier: Unit, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Options,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    @scala.inline
    def newSession(
      options: Options,
      modifier: Unit,
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    
    @scala.inline
    def reloadSession(instance: Client): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("webdriver/build", "DEFAULTS")
  @js.native
  val DEFAULTS: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultOptions<Options> */ js.Any = js.native
  
  @scala.inline
  def getPrototype(hasIsW3CIsChromeIsMobileIsSauceIsSeleniumStandalone: PartialSessionFlags): Record[String, PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(hasIsW3CIsChromeIsMobileIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[Record[String, PropertyDescriptor]]
  
  trait WebDriver extends StObject
}
