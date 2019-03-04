package typings
package traversonLib.traversonMod.TraversonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends js.Object {
  def delete(
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def follow(first_pattern: java.lang.String, rest_patterns: java.lang.String*): Builder
  def get(
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def getResource(
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def getUrl(
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def json(): Builder
  def jsonHal(): Builder
  def newRequest(): Builder
  def patch(
    data: js.Any,
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def post(
    data: js.Any,
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def put(
    data: js.Any,
    callback: js.Function3[
      /* err */ js.Any, 
      /* document */ js.Any, 
      /* traversal */ js.UndefOr[Traversal], 
      scala.Unit
    ]
  ): InAction
  def setMediaType(type_name: java.lang.String): Builder
  def withRequestOptions(options: js.Any): Builder
  def withTemplateParameters(parameters: js.Any): Builder
}

object Builder {
  @scala.inline
  def apply(
    delete: js.Function1[
      js.Function3[
        /* err */ js.Any, 
        /* document */ js.Any, 
        /* traversal */ js.UndefOr[Traversal], 
        scala.Unit
      ], 
      InAction
    ],
    follow: js.Function2[java.lang.String, /* repeated */ java.lang.String, Builder],
    get: js.Function1[
      js.Function3[
        /* err */ js.Any, 
        /* document */ js.Any, 
        /* traversal */ js.UndefOr[Traversal], 
        scala.Unit
      ], 
      InAction
    ],
    getResource: js.Function1[
      js.Function3[
        /* err */ js.Any, 
        /* document */ js.Any, 
        /* traversal */ js.UndefOr[Traversal], 
        scala.Unit
      ], 
      InAction
    ],
    getUrl: js.Function1[
      js.Function3[
        /* err */ js.Any, 
        /* document */ js.Any, 
        /* traversal */ js.UndefOr[Traversal], 
        scala.Unit
      ], 
      InAction
    ],
    json: js.Function0[Builder],
    jsonHal: js.Function0[Builder],
    newRequest: js.Function0[Builder],
    patch: js.Function2[
      js.Any, 
      js.Function3[
        /* err */ js.Any, 
        /* document */ js.Any, 
        /* traversal */ js.UndefOr[Traversal], 
        scala.Unit
      ], 
      InAction
    ],
    post: js.Function2[
      js.Any, 
      js.Function3[
        /* err */ js.Any, 
        /* document */ js.Any, 
        /* traversal */ js.UndefOr[Traversal], 
        scala.Unit
      ], 
      InAction
    ],
    put: js.Function2[
      js.Any, 
      js.Function3[
        /* err */ js.Any, 
        /* document */ js.Any, 
        /* traversal */ js.UndefOr[Traversal], 
        scala.Unit
      ], 
      InAction
    ],
    setMediaType: js.Function1[java.lang.String, Builder],
    withRequestOptions: js.Function1[js.Any, Builder],
    withTemplateParameters: js.Function1[js.Any, Builder]
  ): Builder = {
    val __obj = js.Dynamic.literal(delete = delete, follow = follow, get = get, getResource = getResource, getUrl = getUrl, json = json, jsonHal = jsonHal, newRequest = newRequest, patch = patch, post = post, put = put, setMediaType = setMediaType, withRequestOptions = withRequestOptions, withTemplateParameters = withTemplateParameters)
  
    __obj.asInstanceOf[Builder]
  }
}

