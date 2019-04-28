
# Scala.js typings for swagger-express-middleware

Typings are for version 1.x

## Library description:
Swagger middleware and mocks for Express

|                    |                 |
| ------------------ | :-------------: |
| Full name          | swagger-express-middleware |
| Keywords           | express, swagger, middleware, mock, fake, stub, rest, api, json |
| # releases         | 13 |
| # dependents       | 24 |
| # downloads        | 3163578 |
| # stars            | 7 |

## Links
- [Homepage](https://apidevtools.org/swagger-express-middleware/)
- [Bugs](https://github.com/APIDevTools/swagger-express-middleware/issues)
- [Repository](https://github.com/APIDevTools/swagger-express-middleware)
- [Npm](https://www.npmjs.com/package/swagger-express-middleware)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for swagger-express-middleware 1.x
// Project: https://github.com/BigstickCarpet/swagger-express-middleware
// Definitions by: Alexandre Roba <https://github.com/alexandreroba>
//                 Tromgy <https://github.com/tromgy>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.3
/* =================== USAGE ===================
import * as express from "express";
import * as SwaggerExpressMiddleware from "swagger-express-middleware";

let app = express();

SwaggerExpressMiddleware("PetStore.yaml", app, (err: any, middleware: SwaggerExpressMiddleware.SwaggerMiddleware) => {
    app.use(
        middleware.metadata(),
        middleware.CORS(),
        middleware.files(),
        middleware.parseRequest(),
        middleware.validateRequest(),
        middleware.mock()
    );
});

app.listen(8000, function () {
    console.log('The PetStore sample is now running at http://localhost:8000');
});

 =============================================== */


```

