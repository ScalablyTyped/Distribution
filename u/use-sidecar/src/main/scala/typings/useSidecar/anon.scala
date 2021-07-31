package typings.useSidecar

import typings.react.mod.ComponentType
import typings.std.Error
import typings.useSidecar.typesMod.MediumCallback
import typings.useSidecar.typesMod.removeCb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[T /* <: js.Array[js.Any] */] extends StObject {
    
    def children(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param prop because its type T is not an array type */ prop: T
    ): js.Any
  }
  object Children {
    
    @scala.inline
    def apply[T /* <: js.Array[js.Any] */](children: T => js.Any): Children[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children[T]]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children[?], T /* <: js.Array[js.Any] */] (val x: Self & Children[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: T => js.Any): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait Default[T] extends StObject {
    
    var default: T
  }
  object Default {
    
    @scala.inline
    def apply[T](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default[?], T] (val x: Self & Default[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<use-sidecar.use-sidecar/dist/es5/config.IConfig> */
  trait PartialIConfig extends StObject {
    
    var onError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
  }
  object PartialIConfig {
    
    @scala.inline
    def apply(): PartialIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIConfig]
    }
    
    @scala.inline
    implicit class PartialIConfigMutableBuilder[Self <: PartialIConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnError(value: /* e */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium> */
  trait ReadonlySideCarMedium extends StObject {
    
    val assignMedium: js.Function1[/* handler */ MediumCallback[ComponentType[js.Object]], Unit]
    
    val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ComponentType[js.Object]], Unit]
    
    val options: js.UndefOr[js.Object] = js.undefined
    
    val read: js.Function0[js.UndefOr[ComponentType[js.Object]]]
    
    val useMedium: js.Function1[/* effect */ ComponentType[js.Object], removeCb]
  }
  object ReadonlySideCarMedium {
    
    @scala.inline
    def apply(
      assignMedium: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit,
      assignSyncMedium: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit,
      read: () => js.UndefOr[ComponentType[js.Object]],
      useMedium: /* effect */ ComponentType[js.Object] => removeCb
    ): ReadonlySideCarMedium = {
      val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
      __obj.asInstanceOf[ReadonlySideCarMedium]
    }
    
    @scala.inline
    implicit class ReadonlySideCarMediumMutableBuilder[Self <: ReadonlySideCarMedium] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignMedium(value: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit): Self = StObject.set(x, "assignMedium", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAssignSyncMedium(value: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit): Self = StObject.set(x, "assignSyncMedium", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRead(value: () => js.UndefOr[ComponentType[js.Object]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUseMedium(value: /* effect */ ComponentType[js.Object] => removeCb): Self = StObject.set(x, "useMedium", js.Any.fromFunction1(value))
    }
  }
}
