package typings.superstruct

import typings.std.Omit
import typings.std.Pick
import typings.superstruct.structMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("superstruct/lib/structs/utilities", "assign")
  @js.native
  def assign[A /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, B /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](
    Structs: js.Tuple2[
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<A> */ _, 
        A
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<B> */ _, 
        B
      ]
    ]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<Assign<A, B>> */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Assign<A, B> */ _
  ] = js.native
  @JSImport("superstruct/lib/structs/utilities", "assign")
  @js.native
  def assign[A /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, B /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](
    Structs: js.Tuple3[
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<A> */ _, 
        A
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<B> */ _, 
        B
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<C> */ _, 
        C
      ]
    ]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<Assign<Assign<A, B>, C>> */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Assign<Assign<A, B>, C> */ _
  ] = js.native
  @JSImport("superstruct/lib/structs/utilities", "assign")
  @js.native
  def assign[A /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, B /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, D /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](
    Structs: js.Tuple4[
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<A> */ _, 
        A
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<B> */ _, 
        B
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<C> */ _, 
        C
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<D> */ _, 
        D
      ]
    ]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<Assign<Assign<Assign<A, B>, C>, D>> */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Assign<Assign<Assign<A, B>, C>, D> */ _
  ] = js.native
  @JSImport("superstruct/lib/structs/utilities", "assign")
  @js.native
  def assign[A /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, B /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, D /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](
    Structs: js.Tuple5[
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<A> */ _, 
        A
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<B> */ _, 
        B
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<C> */ _, 
        C
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<D> */ _, 
        D
      ], 
      Struct[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<E> */ _, 
        E
      ]
    ]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<Assign<Assign<Assign<Assign<A, B>, C>, D>, E>> */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Assign<Assign<Assign<Assign<A, B>, C>, D>, E> */ _
  ] = js.native
  
  @JSImport("superstruct/lib/structs/utilities", "dynamic")
  @js.native
  def dynamic[T](
    fn: js.Function2[
      /* value */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context<T, null> */ /* ctx */ js.Any, 
      Struct[T, _]
    ]
  ): Struct[T, Null] = js.native
  
  @JSImport("superstruct/lib/structs/utilities", "omit")
  @js.native
  def omit[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, K /* <: /* keyof S */ String */](
    struct: Struct[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ _, 
      S
    ],
    keys: js.Array[K]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<Omit<S, K>> */ _, 
    Omit[S, K]
  ] = js.native
  
  @JSImport("superstruct/lib/structs/utilities", "partial")
  @js.native
  def partial[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](struct: S): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<PartialObjectSchema<S>> */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObjectSchema<S> */ _
  ] = js.native
  @JSImport("superstruct/lib/structs/utilities", "partial")
  @js.native
  def partial[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](
    struct: Struct[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ _, 
      S
    ]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<PartialObjectSchema<S>> */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObjectSchema<S> */ _
  ] = js.native
  
  @JSImport("superstruct/lib/structs/utilities", "pick")
  @js.native
  def pick[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */, K /* <: /* keyof S */ String */](
    struct: Struct[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ _, 
      S
    ],
    keys: js.Array[K]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<Pick<S, K>> */ _, 
    Pick[S, K]
  ] = js.native
  
  @JSImport("superstruct/lib/structs/utilities", "struct")
  @js.native
  def struct[T](
    name: String,
    validator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Validator<T, null> */ js.Any
  ): Struct[T, Null] = js.native
  
  @JSImport("superstruct/lib/structs/utilities", "lazy")
  @js.native
  def `lazy`[T](fn: js.Function0[Struct[T, _]]): Struct[T, Null] = js.native
}
