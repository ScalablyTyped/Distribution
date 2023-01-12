package typings.vueServerRenderer

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Array
import typings.std.ReadableStream
import typings.std.Record
import typings.std.WritableStream
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueRuntimeCore.mod.Directive
import typings.vueServerRenderer.anon.Checked
import typings.vueServerRenderer.anon.Value
import typings.vueServerRenderer.vueServerRendererBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/server-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pipeToNodeWritable(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: Unit,
    writable: Writable
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeToNodeWritable")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any], writable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pipeToNodeWritable(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: SSRContext,
    writable: Writable
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeToNodeWritable")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any], writable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pipeToWebWritable(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: Unit,
    writable: WritableStream[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeToWebWritable")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any], writable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pipeToWebWritable(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: SSRContext,
    writable: WritableStream[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeToWebWritable")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any], writable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderToNodeStream(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
  ): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToNodeStream")(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def renderToNodeStream(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: SSRContext
  ): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToNodeStream")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  inline def renderToSimpleStream[T /* <: SimpleReadable */](
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: SSRContext,
    stream: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToSimpleStream")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def renderToStream(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
  ): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStream")(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def renderToStream(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: SSRContext
  ): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToStream")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  inline def renderToString(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: SSRContext
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def renderToWebStream(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
  ): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToWebStream")(input.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  inline def renderToWebStream(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify App */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    context: SSRContext
  ): ReadableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToWebStream")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReadableStream[Any]]
  
  inline def ssrGetDirectiveProps_false(
    instance: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ],
    dir: Directive[Any, Any]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDirectiveProps")(instance.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def ssrGetDirectiveProps_false(
    instance: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ],
    dir: Directive[Any, Any],
    value: Any
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDirectiveProps")(instance.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def ssrGetDirectiveProps_false(
    instance: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ],
    dir: Directive[Any, Any],
    value: Any,
    arg: String
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDirectiveProps")(instance.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def ssrGetDirectiveProps_false(
    instance: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ],
    dir: Directive[Any, Any],
    value: Any,
    arg: String,
    modifiers: Record[String, Boolean]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDirectiveProps")(instance.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def ssrGetDirectiveProps_false(
    instance: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ],
    dir: Directive[Any, Any],
    value: Any,
    arg: Unit,
    modifiers: Record[String, Boolean]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDirectiveProps")(instance.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def ssrGetDirectiveProps_false(
    instance: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ],
    dir: Directive[Any, Any],
    value: Unit,
    arg: String
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDirectiveProps")(instance.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def ssrGetDirectiveProps_false(
    instance: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ],
    dir: Directive[Any, Any],
    value: Unit,
    arg: String,
    modifiers: Record[String, Boolean]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDirectiveProps")(instance.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def ssrGetDirectiveProps_false(
    instance: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ],
    dir: Directive[Any, Any],
    value: Unit,
    arg: Unit,
    modifiers: Record[String, Boolean]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDirectiveProps")(instance.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def ssrGetDynamicModelProps(existingProps: Any, model: Any): Checked | Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrGetDynamicModelProps")(existingProps.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Checked | Value | Null]
  
  inline def ssrIncludeBooleanAttr(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ssrIncludeBooleanAttr")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ssrInterpolate(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ssrInterpolate")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ssrLooseContain(arr: js.Array[Any], value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrLooseContain")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ssrLooseEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrLooseEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ssrRenderAttr(key: String, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderAttr")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ssrRenderAttrs(props: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderAttrs")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ssrRenderAttrs(props: Record[String, Any], tag: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderAttrs")(props.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ssrRenderClass(raw: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderClass")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ssrRenderComponent(
    comp: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ Any,
    props: js.UndefOr[Props | Null],
    children: js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any) | SSRSlots | Null
    ],
    parentComponent: js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any) | Null
    ],
    slotScopeId: js.UndefOr[String]
  ): SSRBuffer | js.Promise[SSRBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderComponent")(comp.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[SSRBuffer | js.Promise[SSRBuffer]]
  
  inline def ssrRenderDynamicAttr(key: String, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderDynamicAttr")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def ssrRenderDynamicAttr(key: String, value: Any, tag: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderDynamicAttr")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ssrRenderDynamicModel(`type`: Any, model: Any, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderDynamicModel")(`type`.asInstanceOf[js.Any], model.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ssrRenderList(
    source: Any,
    renderItem: js.Function3[/* value */ Any, /* key */ String | Double, /* index */ js.UndefOr[Double], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderList")(source.asInstanceOf[js.Any], renderItem.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ssrRenderSlot(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlot")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlot(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlot")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlot(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlot")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlot(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlot")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlot(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlot")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlot(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlot")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlot(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlot")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlot(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlot")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ssrRenderSlotInner(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String,
    transition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: Unit,
    transition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String,
    transition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Slots */ Any,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: Unit,
    transition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String,
    transition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: js.Function0[Unit],
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: Unit,
    transition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String,
    transition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderSlotInner(
    slots: SSRSlots,
    slotName: String,
    slotProps: Props,
    fallbackRenderFn: Null,
    push: PushFn,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: Unit,
    transition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSlotInner")(slots.asInstanceOf[js.Any], slotName.asInstanceOf[js.Any], slotProps.asInstanceOf[js.Any], fallbackRenderFn.asInstanceOf[js.Any], push.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ssrRenderStyle(raw: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderStyle")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ssrRenderSuspense(push: PushFn, param1: Record[String, js.UndefOr[js.Function0[Unit]]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderSuspense")(push.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def ssrRenderTeleport(
    parentPush: PushFn,
    contentRenderFn: js.Function1[/* push */ PushFn, Unit],
    target: String,
    disabled: Boolean,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderTeleport")(parentPush.asInstanceOf[js.Any], contentRenderFn.asInstanceOf[js.Any], target.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ssrRenderVNode(
    push: PushFn,
    vnode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderVNode")(push.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssrRenderVNode(
    push: PushFn,
    vnode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    parentComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any,
    slotScopeId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrRenderVNode")(push.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], parentComponent.asInstanceOf[js.Any], slotScopeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Props = Record[String, Any]
  
  type PushFn = js.Function1[/* item */ SSRBufferItem, Unit]
  
  @js.native
  trait SSRBuffer
    extends StObject
       with Array[SSRBufferItem] {
    
    var hasAsync: js.UndefOr[Boolean] = js.native
  }
  
  type SSRBufferItem = String | SSRBuffer | js.Promise[SSRBuffer]
  
  trait SSRContext
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var teleports: js.UndefOr[Record[String, String]] = js.undefined
  }
  object SSRContext {
    
    inline def apply(): SSRContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSRContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSRContext] (val x: Self) extends AnyVal {
      
      inline def setTeleports(value: Record[String, String]): Self = StObject.set(x, "teleports", value.asInstanceOf[js.Any])
      
      inline def setTeleportsUndefined: Self = StObject.set(x, "teleports", js.undefined)
    }
  }
  
  type SSRSlot = js.Function4[
    /* props */ Props, 
    /* push */ PushFn, 
    /* parentComponent */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentInternalInstance */ Any) | Null, 
    /* scopeId */ String | Null, 
    Unit
  ]
  
  type SSRSlots = Record[String, SSRSlot]
  
  @js.native
  trait SimpleReadable extends StObject {
    
    def destroy(err: Any): Unit = js.native
    
    def push(): Unit = js.native
    def push(chunk: String): Unit = js.native
  }
}
